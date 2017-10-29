package com.em248.controller;

import com.em248.util.StringUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 12728 on 2017/10/29.
 */
@RestController
public class IndexController {


    @GetMapping
    public String index() {

        return StringUtil.test("sdfsdfsdfsfd");
    }
}
