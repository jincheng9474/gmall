package com.atguigu.gmall.wms.service.impl;

import com.atguigu.gmall.pms.service.AttrGroupService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AttrGroupServiceImplTest {

    @Autowired
    private AttrGroupService attrGroupService;

    @Test
    void queryGroupWithAttrValuesBy() {
        System.out.println(this.attrGroupService.queryGroupWithAttrValuesByCid(225l, 20l, 27l));
    }
}
