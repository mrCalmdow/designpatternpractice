package com.flchen.designpatternpractice.createPatterns.builderPattern;

/**
 * author fl.chen
 * Date 2019-06-05
 * Time 21:15
 **/
public class MediaPlayerBuilder {

    public static MediaPlayer build(MediaPlayerBuilderFactory factory) {

        factory.setMenu("YYYYY");
        factory.setPlayList("NNNNN");

        return factory.build();
    }
}
