package com.faichuis.faichuismall.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.faichuis.faichuismall.domain.MemberDetails;
import com.faichuis.faichuismall.entity.UmsMemberDO;
import com.faichuis.faichuismall.mapper.UmsMemberMapper;
import com.faichuis.faichuismall.mapper.UmsMemberMemberTagRelationMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
* @vlog: 高于生活，源于生活
* @desc: 类的描述:认证服务器加载用户的类
* @author: smlz
* @createDate: 2020/1/21 21:29
* @version: 1.0
*/
@Slf4j
@Component
public class UserDetailService implements UserDetailsService {

    /**
     * 方法实现说明:用户登陆
     * @author:smlz
     * @param userName 用户名密码
     * @return: UserDetails
     * @exception:
     * @date:2020/1/21 21:30
     */

    @Resource
    private UmsMemberMapper memberMapper;
    @Resource
    private UmsMemberMemberTagRelationMapper memberMemberTagRelationMapper;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        if(StringUtils.isEmpty(userName)) {
            log.warn("用户登陆用户名为空:{}",userName);
            throw new UsernameNotFoundException("用户名不能为空");
        }

        UmsMemberDO umsMember = getByUsername(userName);

        if(null == umsMember) {
            log.warn("根据用户名没有查询到对应的用户信息:{}",userName);
        }

        log.info("根据用户名:{}获取用户登陆信息:{}",userName,umsMember);

        MemberDetails memberDetails = new MemberDetails(umsMember);

        return memberDetails;
    }

    /**
     * 方法实现说明:根据用户名获取用户信息
     * @author:smlz
     * @param username:用户名
     * @return: UmsMember 会员对象
     * @exception:
     * @date:2020/1/21 21:34
     */
    public UmsMemberDO getByUsername(String username) {
        LambdaQueryWrapper<UmsMemberDO> queryWrapper = new LambdaQueryWrapper<UmsMemberDO>()
                .eq(UmsMemberDO::getUsername, username);
        UmsMemberDO umsMemberDO = memberMapper.selectOne(queryWrapper);
        return umsMemberDO;
    }
}
