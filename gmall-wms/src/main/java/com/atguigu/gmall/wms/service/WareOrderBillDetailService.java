package com.atguigu.gmall.wms.service;

import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.wms.entity.WareOrderBillDetailEntity;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 库存工作单
 *
 * @author fengge
 * @email fengge@atguigu.com
 * @date 2021-01-20 14:48:43
 */
public interface WareOrderBillDetailService extends IService<WareOrderBillDetailEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

