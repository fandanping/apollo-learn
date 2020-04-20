package com.apollo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author: fandp
 * @create: 2020-04-20 18:30
 **/
@SpringBootApplication
@EnableApolloConfig
public class AppMain {
    public static void main(String[] args) {
        SpringApplication.run( AppMain.class, args );
    }
}
