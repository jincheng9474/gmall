package com.atguigu.gmall.item.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author : ZJC
 * @date : 2021/2/21 13:41
 * className : ThreadPoolConfig
 * package: com.atguigu.gmall.item.config
 * version : 1.0
 * Description
 */
@Configuration
public class ThreadPoolConfig {

    @Bean
    public ThreadPoolExecutor threadPoolExecutor(
            @Value("${thread.pool.coreSize}") Integer coreSize,
            @Value("${thread.pool.maxSize}") Integer maxSize,
            @Value("${thread.pool.keepAlive}") Integer keepAlive,
            @Value("${thread.pool.blockingQueueSize}") Integer blockingQueueSize
    ){
        return new ThreadPoolExecutor(coreSize, maxSize, keepAlive, TimeUnit.SECONDS, new ArrayBlockingQueue<>(blockingQueueSize));
    }
}
