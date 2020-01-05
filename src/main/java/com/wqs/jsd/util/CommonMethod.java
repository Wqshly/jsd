package com.wqs.jsd.util;

import net.sourceforge.pinyin4j.PinyinHelper;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

import java.security.PrivateKey;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @Author: wan
 * @Date: Created in 16:07 2019/10/3
 * @Description:
 * @Modified By:
 */
public class CommonMethod {

    public Timestamp getTime() {
        Date date = new Date();
        return new Timestamp(date.getTime());
    }

    /**
     * md5加yarn加密
     */
    public String MD5EncryptSalt(String password, String salt) {
        String hashAlgorithmName = "MD5";
        ByteSource byteSource = ByteSource.Util.bytes(salt);
        int hashFrequency = 3;
        SimpleHash simpleHash = new SimpleHash(hashAlgorithmName, password, byteSource, hashFrequency);
        return simpleHash.toString();
    }

    /**
     * 得到中文首字母（中国 -> ZG）
     *
     * @param str 需要转化的中文字符串
     * @return 大写首字母缩写的字符串
     */
    public String getPinYinHeader(String str) {
        StringBuilder convert = new StringBuilder();
        for (int j = 0; j < str.length(); j++) {
            char word = str.charAt(j);
            String[] pinyinArray = PinyinHelper.toHanyuPinyinStringArray(word);
            if (pinyinArray != null) {
                convert.append(pinyinArray[0].charAt(0));
            } else {
                convert.append(word);
            }
        }
        return convert.toString().toUpperCase();
    }
}
