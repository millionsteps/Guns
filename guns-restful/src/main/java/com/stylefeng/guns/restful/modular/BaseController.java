package com.stylefeng.guns.restful.modular;

import com.stylefeng.guns.restful.data.ResponseBean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName BaseController
 * @Description TODO
 * @Author huangjunjie
 * @Date 2018/5/11 下午11:40
 **/
@RestController
public class BaseController {
    @RequestMapping(path = "/401")
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ResponseBean unauthorized() {
        return new ResponseBean(401, "Unauthorized", null);
    }
}
