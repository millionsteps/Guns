package com.stylefeng.guns.restful.modular.auth.resolvers;

import com.stylefeng.guns.core.util.JWTUtil;
import com.stylefeng.guns.restful.data.UserBean;
import com.stylefeng.guns.restful.modular.auth.annotation.CurrentMember;
import com.stylefeng.guns.restful.modular.user.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * Created by Administrator on 2017/6/6.
 */
@Component
public class CurrentMemberMethodArgumentResolver implements HandlerMethodArgumentResolver {
    @Autowired
    private UserService memberService;

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        //如果参数类型是User并且有CurrentUser注解则支持
        if (parameter.getParameterType().isAssignableFrom(UserBean.class) &&
                parameter.hasParameterAnnotation(CurrentMember.class)) {
            return true;
        }
        return false;
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        //取出鉴权时存入的登录用户Id
        Subject subject = SecurityUtils.getSubject();
        String username = JWTUtil.getUsername(subject.getPrincipal().toString());
        return memberService.getUser(username);
    }
}
