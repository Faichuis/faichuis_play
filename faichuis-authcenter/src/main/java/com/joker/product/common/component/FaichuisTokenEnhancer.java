package com.joker.product.common.component;

import com.faichuis.faichuismall.domain.MemberDetails;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

import java.util.HashMap;
import java.util.Map;

public class FaichuisTokenEnhancer implements TokenEnhancer {
    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
        MemberDetails memberDetails = (MemberDetails)authentication.getPrincipal();

        Map<String,Object> additionalInfo = new HashMap<>();

        Map<String,Object> reMap = new HashMap<>();

        additionalInfo.put("memberId",memberDetails.getUmsMember().getId());

        reMap.put("additionalInfo",additionalInfo);

        ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(reMap);

        return accessToken;
    }
}
