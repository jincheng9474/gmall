package com.atguigu.gmall.order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : ZJC
 * @date : 2021/2/26 20:39
 * className : OrderController
 * package: com.atguigu.gmall.order.controller
 * version : 1.0
 * Description
 */
@Controller
public class OrderController {

    @GetMapping("confirm")
    public String confirm(Model model){


        return "trade";
    }
}
