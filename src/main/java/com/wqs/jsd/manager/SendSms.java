package com.wqs.jsd.manager;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import org.springframework.stereotype.Component;

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
@Component
public class SendSms {

    public void sendSms(String signName, String templateCode, String phoneNumbers, String templateParam) {

        //设置超时时间
        System.setProperty("sun.net.client.defaultConnectTimeout", "5000");
        System.setProperty("sun.net.client.defaultReadTimeout", "5000");

        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAI4FfyP96uPhFwzdwpf9q4", "QEk9vvdayTpcs6QsYgoxKkxZY3mzYR");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setSysMethod(MethodType.POST);
        request.setSysDomain("dysmsapi.aliyuncs.com");
        request.setSysVersion("2017-05-25");
        request.setSysAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", phoneNumbers);
        request.putQueryParameter("SignName", signName);
        request.putQueryParameter("TemplateCode", templateCode);
        request.putQueryParameter("TemplateParam", templateParam);
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }

    //随机生成n位随机数
    public int randomCode(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= n - 1; i++) {
            int random = (int) (Math.random() * 9);
            list.add(random);
        }
        for (int i = list.size(); i > 0; i--) {
            int index = (int) (Math.random() * (list.size() - 1));
            stringBuilder.append(list.get(index));
            list.remove(index);
        }
        String s = stringBuilder.toString();
        return Integer.parseInt(s);
    }

}