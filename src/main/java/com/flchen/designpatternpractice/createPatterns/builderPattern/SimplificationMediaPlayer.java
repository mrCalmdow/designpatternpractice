package com.flchen.designpatternpractice.createPatterns.builderPattern;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * author fl.chen
 * Date 2019-06-05
 * Time 20:59
 **/

@Slf4j
@Data
public class SimplificationMediaPlayer extends MediaPlayer {
    @Override
    void playMedia(String content) {

        log.info("SimplificationMediaPlayer Play -- {}", content);
    }

    @Override
    void displayMediaPlayerStyle() {

        log.info("SimplificationMediaPlayer display media player style -- {}", super.toString());
    }
}
