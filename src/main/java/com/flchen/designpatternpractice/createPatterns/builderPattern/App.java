package com.flchen.designpatternpractice.createPatterns.builderPattern;

/**
 * author fl.chen
 * Date 2019-06-05
 * Time 21:10
 **/
public class App {

    public static void main(String[] args) {
        MediaPlayerBuilderFactory builderFactory = new NormalMediaPlayerBuilderFactory();
        builderFactory.setMainFrame("yes");
        builderFactory.setMenu("no");
        builderFactory.setPlayList("yes");
        MediaPlayer mediaPlayer = builderFactory.build();
        mediaPlayer.displayMediaPlayerStyle();
        mediaPlayer.playMedia("gray wolf and happy sheep");


        MediaPlayerBuilderFactory builderFactory1 = new SimplificationMediaPlayerBuilderFactory();
        MediaPlayer mediaPlayer1 = MediaPlayerBuilder.build(builderFactory1);
        mediaPlayer1.displayMediaPlayerStyle();
        mediaPlayer1.playMedia("two bears in the forest");
    }
}
