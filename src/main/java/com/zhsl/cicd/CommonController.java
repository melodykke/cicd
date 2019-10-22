package com.zhsl.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: melodykke
 * @Date: 2019/10/22 5:20 PM
 */
@RestController
@RequestMapping("/common")
public class CommonController {

    @GetMapping("/ok")
    public String ok() {
        return "ok";
    }

    @GetMapping("/ok1")
    public String ok1() {
        return "ok1";
    }

    @GetMapping("/ok2")
    public String ok2() {
        return "ok2";
    }
}
