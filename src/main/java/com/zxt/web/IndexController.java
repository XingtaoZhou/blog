package com.zxt.web;


import com.zxt.exception.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/abc")
    public String abc(){
//        int a = 9/0;
//        String blog = null;
//        if (blog == null){
//            throw new NotFoundException("博客不存在！");
//        }
        System.out.println("------abc------");
        return "admin/index";
    }
}
