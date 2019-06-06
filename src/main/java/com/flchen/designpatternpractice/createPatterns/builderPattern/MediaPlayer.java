package com.flchen.designpatternpractice.createPatterns.builderPattern;

import lombok.Data;

/**
 * author fl.chen
 * Date 2019-06-05
 * Time 20:52
 **/

@Data
public abstract class MediaPlayer {

    private String menu;

    private String playList;

    private String mainFrame;

    private String processBar;

    abstract void playMedia(String content);

    abstract void displayMediaPlayerStyle();
}
