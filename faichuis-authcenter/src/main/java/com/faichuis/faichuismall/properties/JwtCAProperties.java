package com.faichuis.faichuismall.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class JwtCAProperties {

    @Value("${faichuis.jwt.keyPairName}")
    private String keyPairName;

    @Value("${faichuis.jwt.keyPairAlias}")
    private String keyPairAlias;

    @Value("${faichuis.jwt.keyPairSecret}")
    private String keyPairSecret;

    @Value("${faichuis.jwt.keyPairStoreSecret}")
    private String keyPairStoreSecret;
}
