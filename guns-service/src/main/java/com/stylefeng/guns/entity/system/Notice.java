package com.stylefeng.guns.entity.system;

import com.baomidou.mybatisplus.annotations.TableName;
import com.stylefeng.guns.core.base.model.BaseModel;

import java.util.Date;

/**
 * <p>
 * 通知表
 * </p>
 *
 * @author stylefeng
 * @since 2017-07-11
 */
@TableName("sys_notice")
public class Notice extends BaseModel<Notice> {

    private static final long serialVersionUID = 1L;

    /**
     * 标题
     */
	private String title;
    /**
     * 类型
     */
	private Integer type;
    /**
     * 内容
     */
	private String content;
    /**
     * 创建时间
     */
	private Date createtime;
    /**
     * 创建人
     */
	private Integer creater;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Integer getCreater() {
		return creater;
	}

	public void setCreater(Integer creater) {
		this.creater = creater;
	}

	@Override
	public String toString() {
		return "Notice{" +
			"id=" + id +
			", title=" + title +
			", type=" + type +
			", content=" + content +
			", createtime=" + createtime +
			", creater=" + creater +
			"}";
	}
}
