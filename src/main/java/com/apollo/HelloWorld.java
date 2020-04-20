package com.apollo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: fandp
 * @create: 2020-04-20 18:30
 **/
@RestController
@RequestMapping("/user")
public class HelloWorld {
    @Value("${name: testname}")
    private String name;

    @RequestMapping("getName")
    public String searchName(){
      return name;
    }
}
