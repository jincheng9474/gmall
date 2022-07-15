package com.atguigu.gmall.wms.service;

import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.wms.entity.PurchaseEntity;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 采购信息
 *
 * @author ZJC
 * @email 1206904379@qq.com
 * @date 2021-01-20 14:48:43
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

