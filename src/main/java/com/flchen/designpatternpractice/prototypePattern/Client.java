package com.flchen.designpatternpractice.prototypePattern;

import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * author fl.chen
 * Date 2019-06-03
 * Time 19:50
 **/

@Slf4j
public class Client {

    public static void main(String[] args) {
        WeeklyLog weeklyLog = new WeeklyLog();
        weeklyLog.setName("flchen");
        weeklyLog.setDate(new Date());
        weeklyLog.setContent("Very busy week!");
        log.info("weeklyLog -- {}", weeklyLog.toString());

        WeeklyLog weeklyLog1 = weeklyLog.clone();
        weeklyLog1.setContent("I'm fine.");
        log.info("weeklyLog1 -- {}", weeklyLog1.toString());

        WeeklyLog weeklyLog2 = weeklyLog.clone();

        log.info("weekly  ==  weekly2 --- {}", weeklyLog == weeklyLog2);
        log.info("weekly.date  ==  weekly2.date --- {}", weeklyLog.getDate() == weeklyLog2.getDate());
        log.info("weekly.content  ==  weekly2.content --- {}", weeklyLog.getContent() == weeklyLog2.getContent());
    }
}
