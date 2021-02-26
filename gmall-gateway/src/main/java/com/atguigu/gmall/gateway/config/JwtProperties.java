package com.atguigu.gmall.gateway.config;

import com.atguigu.gmall.common.utils.RsaUtils;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.annotation.PostConstruct;
import java.security.PublicKey;

/**
 * @author : ZJC
 * @date : 2021/2/22 22:41
 * className : JwtProperties
 * package: com.atguigu.gmall.gateway.config
 * version : 1.0
 * Description
 */
@Data
@ConfigurationProperties(prefix = "jwt")
public class JwtProperties {

    private String pubKeyPath;
    private String cookieName;

    private PublicKey publicKey;

    /**
     * 读取公钥和私钥赋值给公钥和私钥对象
     */
    @PostConstruct
    public void init(){
        try {
            this.publicKey = RsaUtils.getPublicKey(pubKeyPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

