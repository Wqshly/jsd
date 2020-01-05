package com.wqs.jsd.exceptions;

/**
 * @Author: wan
 * @Date: Created in 16:26 2019/9/18
 * @Description: 未登录异常，自动生成的构造方法
 * @Modified By:
 */
public class UnLoginException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public UnLoginException() {
    }

    public UnLoginException(String message) {
        super(message);
    }

    public UnLoginException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnLoginException(Throwable cause) {
        super(cause);
    }

    public UnLoginException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
