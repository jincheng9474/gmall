package com.atguigu.gmall.wms.mapper;

import com.atguigu.gmall.pms.mapper.SkuAttrValueMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class SkuAttrValueMapperTest {

    @Autowired
    private SkuAttrValueMapper attrValueMapper;

    @Test
    void querySaleAttrsMappingSkuId() {
        System.out.println(this.attrValueMapper.querySaleAttrsMappingSkuId(Arrays.asList(27l, 28l, 29l, 30l)));
    }
}
