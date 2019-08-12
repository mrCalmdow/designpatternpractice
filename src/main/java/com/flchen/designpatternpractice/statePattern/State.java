package com.flchen.designpatternpractice.statePattern;

/**
 * author: flchen
 * Date: 2019-08-11
 * Time: 23:20
 *
 * @Description: 状态机总接口：定义每个状态下的所有行为； 每个状态都实现些总状态接口。
 **/
public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispose();
}
