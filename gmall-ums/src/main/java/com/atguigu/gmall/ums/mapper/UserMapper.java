package com.atguigu.gmall.ums.mapper;

import com.atguigu.gmall.ums.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author ZJC
 * @email 1206904379@qq.com
 * @date 2021-02-21 12:29:04
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
	
}
