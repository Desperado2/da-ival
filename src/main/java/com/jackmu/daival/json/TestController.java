package com.jackmu.daival.json;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("title","jack");
        return "test";
    }
}
