package com.atguigu.gmall.wms.api;

import com.atguigu.gmall.common.bean.ResponseVo;

import com.atguigu.gmall.wms.entity.WareSkuEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author : ZJC
 * @date : 2021/1/28 17:09
 * className : GmallPmsApi
 * package: com.atguigu.gmall.pms.api
 * version : 1.0
 * Description
 */
public interface GmallWmsApi {

    @GetMapping("wms/waresku/sku/{skuId}")
    public ResponseVo<List<WareSkuEntity>> queryWareSkusBySkuId(@PathVariable("skuId")Long skuId);
}