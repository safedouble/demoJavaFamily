package com.example.demojavafamily.service;

import com.example.demojavafamily.api.WechatService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zhujian
 */
public class WechatServiceImpl implements WechatService {

    private static final String TOKEN = "2^qZVnBNWA6X@8J8*JUVH8Vs0pG#Jb";

    @Override
    public String tokenConfirm(String signature, String timestamp, String nonce, String echoStr) {
        Collections.sort(List.of(TOKEN, timestamp, nonce));
        return null;
    }
}
