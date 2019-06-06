package com.flchen.designpatternpractice.createPatterns.prototypePattern;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * author fl.chen
 * Date 2019-06-03
 * Time 19:48
 **/

@Slf4j
@Data
public class WeeklyLog implements Cloneable {

    private String name;

    private Date date;

    private String content;


    public WeeklyLog clone() {

        try {
            return (WeeklyLog) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
