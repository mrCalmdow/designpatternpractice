package com.flchen.designpatternpractice.createPatterns.builderPattern;

/**
 * author fl.chen
 * Date 2019-06-05
 * Time 21:07
 **/
public class NormalMediaPlayerBuilderFactory implements MediaPlayerBuilderFactory {

    private MediaPlayer normalMediaPlayer = new NormalMediaPlayer();

    @Override
    public void setMenu(String menu) {
        normalMediaPlayer.setMenu(menu);
    }

    @Override
    public void setPlayList(String playList) {
        normalMediaPlayer.setPlayList(playList);
    }

    @Override
    public void setMainFrame(String mainFrame) {
        normalMediaPlayer.setMainFrame(mainFrame);
    }

    @Override
    public void setProcessBar(String processBar) {
        normalMediaPlayer.setProcessBar(processBar);
    }

    @Override
    public MediaPlayer build() {
        return normalMediaPlayer;
    }
}
