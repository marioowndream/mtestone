package com.demo.http;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

public class Test {
    public static void main(String[] args) throws Exception {
        HttpClient client = new HttpClient();
        client.getHostConfiguration().setHost("www.imobile.com.cn", 80, "http");
        PostMethod method = new PostMethod("/hello");
        NameValuePair nvp = new NameValuePair("simcard", "1330227");
        method.setRequestBody(new NameValuePair[]{nvp});
        System.out.println(method.getStatusLine());
        client.executeMethod(method);
        System.out.println(method.getStatusLine());

    }
}
