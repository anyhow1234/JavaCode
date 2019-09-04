package com.javacode.exception;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author hans
 * @Date 2019/3/18 20:48
 * @Version 1.0
 */
public class ExcetionDemo {
    public static void main(String[] args) {
        System.out.println(getStr());
    }

    public static String getStr(){
        String a = "";
        try {
            a = "try";
            int i = 1/0;
            return a;
        } catch (Exception e) {
            a = "catch";
            return a;
        } finally {
            a = "finally";
//            return a;
        }
    }

    public void refundSync(String orderNo,String return_amount, String wechat_refund, String alipay_refund, String balance_refund){
        Map<String, Object> paramsMap = new HashMap<String, Object>(){{
            put("orderNo",orderNo);
            put("return_amount",return_amount);
            put("wechat_refund",wechat_refund);
            put("alipay_refund",alipay_refund);
            put("balance_refund",balance_refund);
        }};
    }
}
