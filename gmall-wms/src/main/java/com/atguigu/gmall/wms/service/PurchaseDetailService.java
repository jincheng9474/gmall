package com.atguigu.gmall.wms.service;

import com.atguigu.gmall.pms.entity.PurchaseDetailEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;


/**
 * 
 *
 * @author ZJC
 * @email 1206904379@qq.com
 * @date 2021-01-21 15:22:11
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

