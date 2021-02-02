package com.atguigu.gmall.wms.service;

import com.atguigu.gmall.pms.entity.PurchaseEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;


/**
 * 采购信息
 *
 * @author ZJC
 * @email 1206904379@qq.com
 * @date 2021-01-21 15:22:11
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

