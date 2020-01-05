package com.wqs.jsd.exceptions;

/**
 * @Author: wan
 * @Date: Created in 16:21 2019/9/18
 * @Description: 查询异常，构造方法自动生成
 * @Modified By:
 */
public class CheckException extends RuntimeException {
    public static final long serialVersionUID = 1L;

    public CheckException() {
    }

    public CheckException(String message) {
        super(message);
    }

    public CheckException(String message, Throwable cause) {
        super(message, cause);
    }

    public CheckException(Throwable cause) {
        super(cause);
    }

    public CheckException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
