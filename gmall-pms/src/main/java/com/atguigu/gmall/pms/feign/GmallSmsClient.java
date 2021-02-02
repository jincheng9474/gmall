package com.atguigu.gmall.pms.feign;

import com.atguigu.gmall.sms.api.GmallSmsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author : ZJC
 * @date : 2021/1/21 14:36
 * className : GmallSmsClient
 * package: com.atguigu.gmall.pms.feign
 * version : 1.0
 * Description
 */
@FeignClient("sms-service")
public interface GmallSmsClient extends GmallSmsApi {
}
