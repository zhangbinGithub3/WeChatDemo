package com.atguigu.springboot.controller;

import com.atguigu.springboot.service.PushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/push")
public class PushController  {

    @Autowired
    private PushService pushService;
    /**
     * 推送给所有用户
     * @param msg
     */
    @PostMapping("/pushAll")
    public void pushToAll(@RequestParam("msg") String msg){
        pushService.pushMsgToAll(msg);
    }
    /**
     * 推送给指定用户
     * @param userId
     * @param msg
     */
    @GetMapping("/pushOne")
    public void pushMsgToOne(String userId, String msg){
        pushService.pushMsgToOne(userId,msg);
    }
}
