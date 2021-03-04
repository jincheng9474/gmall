package com.atguigu.gmall.cart.api;

import com.atguigu.gmall.cart.pojo.Cart;
import com.atguigu.gmall.common.bean.ResponseVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author : ZJC
 * @date : 2021/2/27 13:07
 * className : GmallCartApi
 * package: com.atguigu.gmall.cart.api
 * version : 1.0
 * Description
 */
public interface GmallCartApi {

    @GetMapping("user/{userId}")
    @ResponseBody
    public ResponseVo<List<Cart>> queryCheckedCarts(@PathVariable("iserId")Long userId);
}
