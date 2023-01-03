package com.example.designpatterns.adapter.impl;

import com.example.designpatterns.adapter.AdvancedMediaPlayer;

/**
 * 用途: 播放mp4
 *
 * @author: tangjianbo
 * @create: 2022/12/29 18:11
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 media");
    }
}
