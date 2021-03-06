package com.stylefeng.guns.service.system;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.stylefeng.guns.entity.system.LoginLog;
import com.stylefeng.guns.entity.system.OperationLog;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 登录记录 服务类
 * </p>
 *
 * @author stylefeng123
 * @since 2018-02-22
 */
public interface ILoginLogService extends IService<LoginLog> {

    /**
     * 获取登录日志列表
     */
    List<Map<String, Object>> getLoginLogs(Page<OperationLog> page, String beginTime, String endTime, String logName, String orderByField, boolean asc);
}
