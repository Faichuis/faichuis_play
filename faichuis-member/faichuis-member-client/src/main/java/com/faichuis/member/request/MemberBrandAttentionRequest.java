package com.faichuis.member.request;

import lombok.Data;

import java.util.Date;

@Data
public class MemberBrandAttentionRequest {


    private String id;
    private Long memberId;
    private String memberNickname;
    private String memberIcon;
    private Long brandId;
    private String brandName;
    private String brandLogo;
    private String brandCity;
    private Integer brandAttentionCount;
    private Date createTime = new Date();
}
