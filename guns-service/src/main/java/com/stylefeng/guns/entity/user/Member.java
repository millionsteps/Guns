package com.stylefeng.guns.entity.user;

import com.baomidou.mybatisplus.annotations.TableName;
import com.stylefeng.guns.core.base.model.BaseModel;

/**
 * @ClassName Member
 * @Description TODO
 * @Author huangjunjie
 * @Date 2018/5/15 上午11:45
 **/
@TableName("api_member")
public class Member extends BaseModel<Member> {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
