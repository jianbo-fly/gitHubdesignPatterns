package com.example.designpatterns.adapter;

/**
 * 用途: 初始的只能播放mp3的播放器
 *
 * @author: tangjianbo
 * @create: 2022/12/29 18:17
 */
public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("mp3")) {
            System.out.println("Playing mp3");
        } else if (audioType.equals("VLC") || audioType.equals("Mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. "+
                    audioType + " format not supported");
        }

    }
}
