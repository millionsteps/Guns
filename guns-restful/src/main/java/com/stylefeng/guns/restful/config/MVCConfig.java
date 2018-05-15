package com.stylefeng.guns.restful.config;


import com.stylefeng.guns.restful.modular.auth.resolvers.CurrentMemberMethodArgumentResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * 配置类，增加自定义拦截器和解析器
 * @author ScienJus
 * @date 2015/7/30.
 */
@Configuration
public class MVCConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private CurrentMemberMethodArgumentResolver currentMemberMethodArgumentResolver;

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(currentMemberMethodArgumentResolver);
    }
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }
}
