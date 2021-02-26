package com.atguigu.gmall.wms.service;

import com.atguigu.gmall.wms.entity.WareSkuEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;


/**
 * 商品库存
 *
 * @author ZJC
 * @email 1206904379@qq.com
 * @date 2021-01-21 15:22:11
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

