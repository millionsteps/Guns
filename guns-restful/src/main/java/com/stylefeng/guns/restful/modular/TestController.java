package com.stylefeng.guns.restful.modular;

import com.stylefeng.guns.core.util.JWTUtil;
import com.stylefeng.guns.restful.data.ResponseBean;
import com.stylefeng.guns.restful.data.UserBean;
import com.stylefeng.guns.restful.modular.auth.annotation.CurrentMember;
import com.stylefeng.guns.restful.modular.user.UserService;
import com.stylefeng.guns.service.user.IMemberService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author huangjunjie
 * @Date 2018/5/11 下午9:00
 **/
@RestController
@RequestMapping(value = "test")
public class TestController {
    @Autowired
    private UserService userService;

    @GetMapping
    public String getTest(){
        return "你好！";
    }

    @PostMapping("/login")
    public ResponseBean login(@RequestParam("username") String username,
                              @RequestParam("password") String password) {
        UserBean userBean = userService.getUser(username);
        if (userBean.getPassword().equals(password)) {
            return new ResponseBean(200, "Login success", JWTUtil.sign(username, password));
        } else {
            throw new UnauthorizedException();
        }
    }

    @GetMapping("/article")
    public ResponseBean article(@CurrentMember UserBean userBean) {
        Subject subject = SecurityUtils.getSubject();
        if (subject.isAuthenticated()) {
            return new ResponseBean(200, "You are already logged in", null);
        } else {
            return new ResponseBean(200, "You are guest", null);
        }
    }
    @GetMapping("/require_auth")
    @RequiresAuthentication
    public ResponseBean requireAuth() {
        return new ResponseBean(200, "You are authenticated", null);
    }


}
