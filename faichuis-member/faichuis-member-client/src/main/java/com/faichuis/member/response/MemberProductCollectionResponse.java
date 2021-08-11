package com.faichuis.member.response;

import lombok.Data;

import java.util.Date;

@Data
public class MemberProductCollectionResponse {

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
