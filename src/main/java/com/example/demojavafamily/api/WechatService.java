package com.example.demojavafamily.api;


/**
 * @author zhujian
 */
public interface WechatService {

    /**
     * 服务器验证
     * @return
     */
    String tokenConfirm(String signature, String timestamp, String nonce, String echoStr);
}
