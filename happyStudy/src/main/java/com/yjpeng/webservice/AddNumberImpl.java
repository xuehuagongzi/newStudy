package com.yjpeng.webservice;

import javax.jws.WebService;

/**
 * Created by zhangwenqiang on 2016/12/12.
 */
@WebService(targetNamespace="http://webservice.yjpeng.com", serviceName="AddNumberImplService",
        portName="AddNumberImpl")
public class AddNumberImpl implements AddNum {
    public int addNumbers(int a, int b) {
        return a + b;
    }
}
