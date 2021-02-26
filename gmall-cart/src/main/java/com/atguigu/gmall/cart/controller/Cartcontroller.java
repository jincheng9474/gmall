package com.atguigu.gmall.cart.controller;

import com.atguigu.gmall.cart.pojo.Cart;
import com.atguigu.gmall.cart.service.CartSercive;
import com.atguigu.gmall.common.bean.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author : ZJC
 * @date : 2021/2/23 21:24
 * className : Cartcontroller
 * package: com.atguigu.gmall.cart.controller
 * version : 1.0
 * Description
 */
@Controller
public class Cartcontroller {

    @Autowired
    private CartSercive cartSercive;

    @GetMapping
    public  String saveCart(Cart cart){
        this.cartSercive.saveCart(cart);

        return "redirect:http://cart.gmall.com/addCart.html?skuId=" + cart.getSkuId();
    }

    @GetMapping("addCart.html")
    public String toCart(@RequestParam("skuId")Long skuId, Model model){
        Cart cart = this.cartSercive.queryCartBySkuId(skuId);
        model.addAttribute("cart", cart);
        return "addCart";
    }

    @GetMapping("cart.html")
    public String queryCarts(Model model){
        List<Cart> carts = this.cartSercive.queryCArts();
        model.addAttribute("carts", carts);
        return "cart";
    }

    @GetMapping("updateNum")
    @ResponseBody
    public ResponseVo updateNum(@RequestBody Cart cart){
        this.cartSercive.updateNum(cart);
        return ResponseVo.ok();
    }

    @GetMapping("deleteCart")
    @ResponseBody
    public ResponseVo deleteCart(@RequestParam("skuId")Long skuId){
        this.cartSercive.deleteCart(skuId);
        return ResponseVo.ok();
    }

    @RequestMapping("test")
    @ResponseBody
    public String test(HttpServletRequest request){
        long now = System.currentTimeMillis();
        this.cartSercive.executor1();
        this.cartSercive.executor2();
//        future1.addCallback(result -> {
//            System.out.println(result);
//        }, ex -> {
//            System.out.println(ex.getMessage());
//        });
//        future2.addCallback(result -> {
//            System.out.println(result);
//        }, ex -> {
//            System.out.println(ex.getMessage());
//        });
//        try {
//            //System.out.println(future1.get());
//            System.out.println(future2.get());
//        } catch (Exception e) {
//            System.out.println(e.getMessage() + "==========================");
//        }
        System.out.println("controller方法的执行时间：" + (System.currentTimeMillis() - now));
        return "hello Test";
    }
}
