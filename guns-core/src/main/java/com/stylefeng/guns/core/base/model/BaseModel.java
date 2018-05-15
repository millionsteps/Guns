package com.stylefeng.guns.core.base.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * @ClassName BaseModel
 * @Description TODO
 * @Author huangjunjie
 * @Date 2018/5/15 上午11:53
 **/
public class BaseModel<T> extends Model {
    @TableId(value="id", type= IdType.AUTO)
    protected Integer id;
    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
