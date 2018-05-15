package com.stylefeng.guns.service.user.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.stylefeng.guns.dao.user.MemberMapper;
import com.stylefeng.guns.entity.user.Member;
import com.stylefeng.guns.service.user.IMemberService;
import org.springframework.stereotype.Service;

/**
 * @ClassName MemberServiceImpl
 * @Description TODO
 * @Author huangjunjie
 * @Date 2018/5/15 下午1:44
 **/
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper,Member> implements IMemberService {
}
