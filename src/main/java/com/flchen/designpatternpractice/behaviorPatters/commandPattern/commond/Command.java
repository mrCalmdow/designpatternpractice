package com.flchen.designpatternpractice.behaviorPatters.commandPattern.commond;

/**
 * author: flchen
 * Date: 2019-07-24
 * Time: 13:46
 *
 * @Description: 命令接口：所有命令实现它
 **/
public interface Command {

    void execute();

    void undo();
}
