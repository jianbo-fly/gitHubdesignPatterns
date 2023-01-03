package com.example.designpatterns.adapter;

/**
 * 用途: 媒体播放器
 *
 * @author: tangjianbo
 * @create: 2022/12/29 18:06
 */

public interface MediaPlayer {
    /**
     * 播放媒体
     * @param audioType
     * @param fileName
     */
    void play(String audioType, String fileName);
}
