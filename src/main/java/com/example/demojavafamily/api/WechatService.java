package com.example.demojavafamily.api;


/**
 * @author zhujian
 */
public interface WechatService {

    /**
     * token验证
     *
     * @param signature 签名
     * @param timestamp 时间戳
     * @param nonce     噪声
     * @param echoStr   验证结果
     * @return 结果
     */
    String tokenConfirm(String signature, String timestamp, String nonce, String echoStr);

    String test();
}
