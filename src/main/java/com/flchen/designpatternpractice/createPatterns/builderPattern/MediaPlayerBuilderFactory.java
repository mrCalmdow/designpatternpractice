package com.flchen.designpatternpractice.createPatterns.builderPattern;

/**
 * author fl.chen
 * Date 2019-06-05
 * Time 21:01
 **/
public interface MediaPlayerBuilderFactory {

    void setMenu(String menu);
    void setPlayList(String playList);
    void setMainFrame(String mainFrame);
    void setProcessBar(String processBar);

    MediaPlayer build();

}
