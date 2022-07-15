package com.atguigu.gmall.wms.service;

import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.wms.entity.PurchaseDetailEntity;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 
 *
 * @author ZJC
 * @email 1206904379@qq.com
 * @date 2021-01-20 14:48:43
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

