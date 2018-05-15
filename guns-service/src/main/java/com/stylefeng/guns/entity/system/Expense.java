package com.stylefeng.guns.entity.system;

import com.baomidou.mybatisplus.annotations.TableName;
import com.stylefeng.guns.core.base.model.BaseModel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 报销表
 * </p>
 *
 * @author stylefeng
 * @since 2017-12-05
 */
@TableName("sys_expense")
public class Expense extends BaseModel<Expense> {

    private static final long serialVersionUID = 1L;

    /**
     * 报销金额
     */
	private BigDecimal money;
    /**
     * 描述
     */
	private String desc;
	private Date createtime;
    /**
     * 状态: 1.待提交  2:待审核   3.审核通过
     */
	private Integer state;
    /**
     * 用户id
     */
	private Integer userid;
    /**
     * 流程定义id
     */
	private String processId;

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getProcessId() {
		return processId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}

	@Override
	public String toString() {
		return "Expense{" +
			"id=" + id +
			", money=" + money +
			", desc=" + desc +
			", createtime=" + createtime +
			", state=" + state +
			", userid=" + userid +
			", processId=" + processId +
			"}";
	}
}
