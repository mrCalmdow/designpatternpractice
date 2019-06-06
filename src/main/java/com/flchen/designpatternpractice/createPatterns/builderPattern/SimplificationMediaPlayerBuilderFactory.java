package com.flchen.designpatternpractice.createPatterns.builderPattern;

/**
 * author fl.chen
 * Date 2019-06-05
 * Time 21:07
 **/
public class SimplificationMediaPlayerBuilderFactory implements MediaPlayerBuilderFactory {

    private MediaPlayer simplificationMediaPlayer = new SimplificationMediaPlayer();

    @Override
    public void setMenu(String menu) {
        simplificationMediaPlayer.setMenu(menu);
    }

    @Override
    public void setPlayList(String playList) {
        simplificationMediaPlayer.setPlayList(playList);
    }

    @Override
    public void setMainFrame(String mainFrame) {
        simplificationMediaPlayer.setMainFrame(mainFrame);
    }

    @Override
    public void setProcessBar(String processBar) {
        simplificationMediaPlayer.setProcessBar(processBar);
    }

    @Override
    public MediaPlayer build() {
        return simplificationMediaPlayer;
    }
}
