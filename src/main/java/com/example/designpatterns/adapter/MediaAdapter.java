package com.example.designpatterns.adapter;

import com.example.designpatterns.adapter.impl.Mp4Player;
import com.example.designpatterns.adapter.impl.VlcPlayer;

/**
 * 用途: 适配器
 *
 * @author: tangjianbo
 * @create: 2022/12/29 18:13
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("VLC")) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equals("Mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
