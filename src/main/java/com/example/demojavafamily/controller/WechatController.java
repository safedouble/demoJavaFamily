package com.example.demojavafamily.controller;

import com.example.demojavafamily.api.WechatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhujian
 */
@RestController("wechat")
public class WechatController {

    private final WechatService wechatService;

    @Autowired
    public WechatController(WechatService wechatService) {
        this.wechatService = wechatService;
    }

    @GetMapping("/tokenConfirm")
    public String tokenConfirm(@RequestParam String signature, @RequestParam String timestamp, @RequestParam String nonce, @RequestParam String echostr) {
        return wechatService.tokenConfirm(signature, timestamp, nonce, echostr);
    }
}
