package com.atguigu.gmall.search.repository;

import com.atguigu.gmall.search.pojo.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

/**
 * @author : ZJC
 * @date : 2021/1/28 16:45
 * className : GoodsRepository
 * package: com.atguigu.gmall.search.repository
 * version : 1.0
 * Description
 */
public interface GoodsRepository extends ElasticsearchCrudRepository<Goods, Long> {
}
