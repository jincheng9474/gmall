package com.atguigu.gmall.index.config;


import java.lang.annotation.*;

/**
 * @author SongMc
 * @date 2021/2/11 15:03
 * @InterfaceName GmallCache
 * version : 1.0
 * Description
 **/
@Target({ElementType.METHOD}) //注解作用在方法上
@Retention(RetentionPolicy.RUNTIME) //运行时注解
@Documented
public @interface GmallCache {
    /**
     * @Date 2021/2/11 15:04
     * @return
     * 缓存的前缀
     * 将来缓存的key：prefix + 方法参数
     *
     */
    String prefix() default "";

    /**
     * @Date 2021/2/11 15:06
     * @return 缓存的过期时间
     * 单位为min
     */
    int timeout() default 5;

    /**
     * 为了防止缓存雪崩
     * 给缓存指定随机值范围
     * @return
     */
    int random() default 5;

    /**
     * @Date 2021/2/11 16:02
     * @return
     * 为了防止缓存击穿，添加分布式锁
     * 此处需要制定分布式锁前缀
     */
    String lock() default "lock:";
}
