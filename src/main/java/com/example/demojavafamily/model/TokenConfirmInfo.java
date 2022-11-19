package com.example.demojavafamily.model;

/**
 * @author zhujian
 */
public class TokenConfirmInfo {
    private String signature;
    private String timestamp;
    private String nonce;
    private String echostr;

    public String getSignature() {
        return signature;
    }

    public TokenConfirmInfo setSignature(String signature) {
        this.signature = signature;
        return this;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public TokenConfirmInfo setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getNonce() {
        return nonce;
    }

    public TokenConfirmInfo setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }

    public String getEchostr() {
        return echostr;
    }

    public TokenConfirmInfo setEchostr(String echostr) {
        this.echostr = echostr;
        return this;
    }
}
