package com.atguigu.gmall.wms.service.impl;

import com.atguigu.gmall.pms.service.SkuAttrValueService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SkuAttrValueServiceImplTest {

    @Autowired
    private SkuAttrValueService skuAttrValueService;

    @Test
    void queryPage() {
    }

    @Test
    void querySearchAttrValuesByCidAndSkuId() {
    }

    @Test
    void querySaleAttrsBySpuId() {
    }

    @Test
    void querySaleAttrsMappingSkuIdBySpuId() {
        System.out.println(this.skuAttrValueService.querySaleAttrsMappingSkuIdBySpuId(36l));
    }
}
