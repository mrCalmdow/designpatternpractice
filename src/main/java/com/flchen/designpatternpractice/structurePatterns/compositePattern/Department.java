package com.flchen.designpatternpractice.structurePatterns.compositePattern;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

/**
 * author fl.chen
 * Date 2019-06-10
 * Time 20:28
 **/

@Slf4j
public class Department extends AbstractDepartment {

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    protected void addOne(AbstractDepartment abstractDepartment) {
        Assert.notNull(abstractDepartment, "Element ca't be null");
        if(children.contains(abstractDepartment)) {
            return ;
        }
        this.children.add(abstractDepartment);
    }

    @Override
    protected void removeOne(AbstractDepartment abstractDepartment) {

        if(!CollectionUtils.isEmpty(children)) {
            for (AbstractDepartment department : children) {
                if(department.equals(abstractDepartment)) {
                    children.remove(abstractDepartment);
                }
            }
        }
    }

    @Override
    protected AbstractDepartment getChild(int i) {
        Assert.isTrue(i >= 0, "index must be positive integer.");
        if(children.size() >= i) {
            return children.get(i);
        }
        return null;
    }

    @Override
    protected void sendNotification(String msg) {
        if(!CollectionUtils.isEmpty(children)) {
            for (AbstractDepartment department : children){
                department.sendNotification(msg);
            }
        }
        log.info("Department [{}] notify: {}", departmentName, msg);
    }
}
