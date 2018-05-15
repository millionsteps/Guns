package com.stylefeng.guns.restful;

import com.stylefeng.guns.entity.user.Member;
import com.stylefeng.guns.service.user.IMemberService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName MemberServiceTests
 * @Description TODO
 * @Author huangjunjie
 * @Date 2018/5/15 下午2:00
 **/
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class MemberServiceTests {
    @Autowired
    private IMemberService memberService;

    @Test
    public void test(){
        Member member = memberService.selectById(1);
        Assert.assertNotNull(member);
    }
}
