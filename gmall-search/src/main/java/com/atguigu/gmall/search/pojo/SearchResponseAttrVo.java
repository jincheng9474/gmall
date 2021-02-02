package com.atguigu.gmall.search.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author : ZJC
 * @date : 2021/1/29 20:27
 * className : SearchResponseAttrVo
 * package: com.atguigu.gmall.search.pojo
 * version : 1.0
 * Description
 */
@Data
public class SearchResponseAttrVo {
    private Long attrId;

    private String attrName;

    //规格参数的可选值列表
    private List<String> attrValues;
}
