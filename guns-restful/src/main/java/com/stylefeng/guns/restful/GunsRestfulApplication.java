package com.stylefeng.guns.restful;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.stylefeng.guns")
@MapperScan(basePackages = "com.stylefeng.guns.dao", markerInterface = BaseMapper.class)
public class GunsRestfulApplication {

    public static void main(String[] args) {
        SpringApplication.run(GunsRestfulApplication.class, args);
    }
}
