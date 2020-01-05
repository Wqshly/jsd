package com.wqs.jsd.util;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

import java.util.ArrayList;
import java.util.List;

/*
pom.xml
<dependency>
  <groupId>com.aliyun</groupId>
  <artifactId>aliyun-java-sdk-core</artifactId>
  <version>4.0.3</version>
</dependency>
*/
public class SendSms {

    public SendSms() {
    }

    public int sendShortText(String phoneNum) {
        //随机生成六位随机数
        StringBuilder stringBuilder = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 5; i++) {
            int random = (int) (Math.random() * 9);
            list.add(random);
        }
        for (int i = list.size(); i > 0; i--) {
            int index = (int) (Math.random() * (list.size() - 1));
            stringBuilder.append(list.get(index));
            list.remove(index);
        }
        String s = stringBuilder.toString();
        int codeNum = Integer.parseInt(s);
        System.out.println(codeNum);
        String templateParam = "{\"code\":\"" + codeNum + "\"}";
        //设置超时时间
        System.setProperty("sun.net.client.defaultConnectTimeout", "5000");
        System.setProperty("sun.net.client.defaultReadTimeout", "5000");
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou",
                "LTAI4FfyP96uPhFwzdwpf9q4", "QEk9vvdayTpcs6QsYgoxKkxZY3mzYR");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", phoneNum);
        request.putQueryParameter("SignName", "青岛洁时代");
        request.putQueryParameter("TemplateCode", "SMS_180270309");
        request.putQueryParameter("TemplateParam", templateParam);
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ClientException e) {
            e.printStackTrace();
        }
        return codeNum;
    }
}