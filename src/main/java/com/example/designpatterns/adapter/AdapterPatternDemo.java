package com.example.designpatterns.adapter;

/**
 * 用途: 测试类
 *
 * @author: tangjianbo
 * @create: 2022/12/29 18:22
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("VLC", "vlc fileName");
        audioPlayer.play("Mp4", "mp4 fileName");
        audioPlayer.play("mp3", "mp3 fileName");
    }
}
