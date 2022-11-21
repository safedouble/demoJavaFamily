package com.example.demojavafamily.service;

import com.example.demojavafamily.api.WechatService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zhujian
 */
@Service
public class WechatServiceImpl implements WechatService {

    private static final String TOKEN = "2^qZVnBNWA6X@8J8*JUVH8Vs0pG#Jb";

    @Override
    public String tokenConfirm(String signature, String timestamp, String nonce, String echoStr) {
        return echoStr;
    }

    @Override
    public String test() {
        return "this api is enable";
    }
}
