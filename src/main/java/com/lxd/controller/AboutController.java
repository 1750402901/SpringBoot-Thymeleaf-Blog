package com.lxd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : Lxd
 * @date : 17:41 2021/4/13
 */
@Controller
public class AboutController {
    @GetMapping("/about")
    public String about(){
        return "about";
    }
}
