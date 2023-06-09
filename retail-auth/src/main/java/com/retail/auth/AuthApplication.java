package com.retail.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 类的说明
 *
 * @Author: 手速很慢的King
 * @DateTime: 2023/02/01 19:48
 * @Description
 **/

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableFeignClients
public class AuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class);
    }
}
