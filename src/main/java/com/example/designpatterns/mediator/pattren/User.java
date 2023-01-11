package com.example.designpatterns.mediator.pattren;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 用途:
 *
 * @author tangjianbo
 * @date 2023/01/09 10:54
 */
@Data
@AllArgsConstructor
public class User {
    private String name;

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }

}
