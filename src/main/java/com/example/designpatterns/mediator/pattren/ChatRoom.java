package com.example.designpatterns.mediator.pattren;

import java.util.Date;

/**
 * 用途:获取用户的message
 *
 * @author tangjianbo
 * @date 2023/01/09 11:00
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + "[" + user.getName() + "] :" + message);
    }
}
