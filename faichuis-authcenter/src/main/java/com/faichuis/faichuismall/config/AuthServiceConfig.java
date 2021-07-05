package com.faichuis.faichuismall.config;


import com.faichuis.faichuismall.component.FaichuisTokenEnhancer;
import com.faichuis.faichuismall.properties.JwtCAProperties;
import com.faichuis.faichuismall.service.TulingUserDetailService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.oauth2.provider.token.TokenEnhancerChain;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
import org.springframework.security.oauth2.provider.token.store.KeyStoreKeyFactory;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.security.KeyPair;
import java.util.Arrays;

@EnableAuthorizationServer
@Configuration
public class AuthServiceConfig extends AuthorizationServerConfigurerAdapter {

    @Resource
    private DataSource dataSource;
    @Resource
    private JwtCAProperties jwtCAProperties;
    @Resource
    private TulingUserDetailService tulingUserDetailService;
    @Resource
    private AuthenticationManager authenticationManager;

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.withClientDetails(faichuisClientDetailsService());
    }

    @Bean
    public ClientDetailsService faichuisClientDetailsService(){


        return  new JdbcClientDetailsService(dataSource);
    }

    @Bean
    public TokenStore tokenStore(){

        return  new JwtTokenStore(jwtAccessTokenConverter());
    }

    @Bean
    public JwtAccessTokenConverter jwtAccessTokenConverter(){
        JwtAccessTokenConverter jwtAccessTokenConverter = new JwtAccessTokenConverter();
        jwtAccessTokenConverter.setKeyPair(keyPair());
        return jwtAccessTokenConverter;
    }

    @Bean
    public KeyPair keyPair(){

        KeyStoreKeyFactory  keyStoreKeyFactory = new KeyStoreKeyFactory(new ClassPathResource(jwtCAProperties.getKeyPairName()),jwtCAProperties.getKeyPairSecret().toCharArray());
        return keyStoreKeyFactory.getKeyPair(jwtCAProperties.getKeyPairAlias(),jwtCAProperties.getKeyPairStoreSecret().toCharArray());
    }

    @Bean
    public FaichuisTokenEnhancer faichuisTokenEnhancer(){
        return  new FaichuisTokenEnhancer();
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        TokenEnhancerChain tokenEnhancerChain = new TokenEnhancerChain();
        tokenEnhancerChain.setTokenEnhancers(Arrays.asList(faichuisTokenEnhancer(),jwtAccessTokenConverter()));
        endpoints.tokenStore(tokenStore())
                .tokenEnhancer(tokenEnhancerChain)
                .userDetailsService(tulingUserDetailService)
                .authenticationManager(authenticationManager);
    }
}
