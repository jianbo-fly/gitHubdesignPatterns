package com.example.designpatterns.adapter;

/**
 * 用途: 播放vlc和Mp4的播放器
 *
 * @author: tangjianbo
 * @create: 2022/12/29 18:08
 */

public interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}
