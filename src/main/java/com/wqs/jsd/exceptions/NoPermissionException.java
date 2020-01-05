package com.wqs.jsd.exceptions;

/**
 * @Author: wan
 * @Date: Created in 16:24 2019/9/18
 * @Description: 权限异常，构造方法自动生成
 * @Modified By:
 */
public class NoPermissionException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public NoPermissionException() {
    }

    public NoPermissionException(String message) {
        super(message);
    }

    public NoPermissionException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoPermissionException(Throwable cause) {
        super(cause);
    }

    public NoPermissionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
