package com.wqs.jsd.util;

import com.wqs.jsd.exceptions.CheckException;
import org.springframework.context.MessageSource;

import java.util.Locale;

/**
 * @Author: wan
 * @Date: Created in 16:12 2019/9/18
 * @Description: 对数据进行检查
 * @Modified By:
 */
public class CheckUtil {
    private static MessageSource messageSource;

    public static void fail(String messageCode, Object... args) {
        throw new CheckException(messageSource.getMessage(messageCode, args, Locale.CHINA));
    }

    public static void check(boolean condition, String messageCode, Object... args) {
        if (!condition) {
            fail(messageCode, args);
        }
    }

    public static void notNull(Object object, String messageCode, Object... args) {
        if (object == null) {
            fail(messageCode, args);
        }
    }

    public static void notEmpty(String string, String messageCode, Object... args) {
        if (string == null || string.isEmpty()) {
            fail(messageCode, args);
        }
    }

    public static void setMessageSource(MessageSource messageSource) {
        CheckUtil.messageSource = messageSource;
    }
}
