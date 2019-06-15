package com.flchen.designpatternpractice.structurePatterns.compositePattern;

import lombok.extern.slf4j.Slf4j;

/**
 * author fl.chen
 * Date 2019-06-10
 * Time 20:54
 **/

@Slf4j
public class Employee extends AbstractDepartment {

    public Employee(String name) {
        this.departmentName = name;
    }

    @Override
    protected void addOne(AbstractDepartment abstractDepartment) {

        log.info("Not support this operation!");
    }

    @Override
    protected void removeOne(AbstractDepartment abstractDepartment) {

        log.info("Not support this operation!");
    }

    @Override
    protected AbstractDepartment getChild(int i) {
        log.info("Not support this operation!");
        return null;
    }

    @Override
    protected void sendNotification(String msg) {

        log.info("Employee {} received: {}", departmentName, msg);
    }
}
