package com.faichuis.member.request;

import lombok.Data;

import java.util.Date;

@Data
public class MemberProductCollectionRequest {

    private String id;
    private Long memberId;
    private String memberNickname;
    private String memberIcon;
    private Long productId;
    private String productName;
    private String productPic;
    private String productSubTitle;
    private String productPrice;
    private Date createTime;
}
