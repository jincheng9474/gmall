package com.atguigu.gmall.common.exception;

/**
 * @author : ZJC
 * @date : 2021/2/22 19:28
 * className : UserException
 * package: com.atguigu.gmall.common.exception
 * version : 1.0
 * Description
 */
public class UserException extends RuntimeException {
    public UserException() {
        super();
    }

    public UserException(String message) {
        super(message);
    }
}
