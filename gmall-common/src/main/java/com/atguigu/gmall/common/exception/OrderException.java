package com.atguigu.gmall.common.exception;

/**
 * @author : ZJC
 * @date : 2021/2/27 13:51
 * className : OrderException
 * package: com.atguigu.gmall.common.exception
 * version : 1.0
 * Description :
 */
public class OrderException extends RuntimeException{
    public OrderException() {
        super();
    }

    public OrderException(String message) {
        super(message);
    }
}
