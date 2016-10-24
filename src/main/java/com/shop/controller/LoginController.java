package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dima- on 23.10.2016.
 */
@Controller
public class LoginController {
    @RequestMapping(value = "/login")
    public String loginPage() {
        return "login";
    }
}
