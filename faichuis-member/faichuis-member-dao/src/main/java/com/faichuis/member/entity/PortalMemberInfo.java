package com.faichuis.member.entity;

import com.faichuis.faichuismall.model.UmsMember;
import com.faichuis.faichuismall.model.UmsMemberLevel;
import lombok.Data;

@Data
public class PortalMemberInfo extends UmsMember {

    private UmsMemberLevel umsMemberLevel;
}
