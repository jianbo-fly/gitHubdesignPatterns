package com.example.designpatterns.adapter.impl;

import com.example.designpatterns.adapter.AdvancedMediaPlayer;

/**
 * 用途: 播放vlc
 *
 * @author: tangjianbo
 * @create: 2022/12/29 18:10
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing Vlc media");
    }

    @Override
    public void playMp4(String fileName) {

    }
}
