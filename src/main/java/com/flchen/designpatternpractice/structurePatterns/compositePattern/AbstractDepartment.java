package com.flchen.designpatternpractice.structurePatterns.compositePattern;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * author fl.chen
 * Date 2019-06-10
 * Time 20:20
 **/

@Slf4j
public abstract class AbstractDepartment {

    protected String departmentName;

    protected List<AbstractDepartment> children = new ArrayList<>();

    protected abstract void addOne(AbstractDepartment abstractDepartment);
    protected abstract void removeOne(AbstractDepartment abstractDepartment);

    protected abstract AbstractDepartment getChild(int i);

    protected abstract void sendNotification(String msg);
}
