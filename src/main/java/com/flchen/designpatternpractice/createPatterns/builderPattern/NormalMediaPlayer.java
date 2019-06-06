package com.flchen.designpatternpractice.createPatterns.builderPattern;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * author fl.chen
 * Date 2019-06-05
 * Time 20:53
 **/

@Slf4j
@Data
public class NormalMediaPlayer extends MediaPlayer {

    @Override
    public void playMedia(String content) {

        log.info("NormalMediaPlayer Play -- {}", content);
    }

    @Override
    public void displayMediaPlayerStyle() {

        log.info("NormalMediaPlayer display media player style -- {}", super.toString());
    }
}
