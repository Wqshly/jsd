package com.wqs.jsd.util;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @Author: wan
 * @Date: Created in 15:37 2020/1/18
 * @Description:
 * @Modified By:
 */
@Component
public class CodeUtil {
    private static Integer number = 1;
    private static final int maxNum = 100;
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmss");

    /**
     * uuid生成没有 — 的编号
     *
     * @return: String 唯一编号UUID
     */
    public static String createUUID() {
        String uuid = UUID.randomUUID().toString();
        return uuid.replaceAll("\\-", "");
    }

    // 15位编号
    public static String createCode() {
        number++;
        while (number >= maxNum) {
            number -= maxNum;
        }
        return sdf.format(new Date()) + number;
    }
}
