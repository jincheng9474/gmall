package com.atguigu.gmall.sms.api;

import com.atguigu.gmall.common.bean.ResponseVo;
import com.atguigu.gmall.sms.vo.ItemSaleVo;
import com.atguigu.gmall.sms.vo.SkuSaleVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author : ZJC
 * @date : 2021/1/21 11:47
 * className : GmallSmsApi
 * package: com.atguigu.gmall.sms.api
 * version : 1.0
 * Description
 */
public interface GmallSmsApi {
    @PostMapping("sms/skubounds/save")
    public ResponseVo saveSales(@RequestBody SkuSaleVo saleVo);

    @GetMapping("sms/skubounds/sales/{skuId}")
    public ResponseVo<List<ItemSaleVo>> querySalesBySkuId(@PathVariable("skuId")Long skuId);
}
