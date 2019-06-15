package com.flchen.designpatternpractice.structurePatterns.compositePattern;

/**
 * author fl.chen
 * Date 2019-06-10
 * Time 20:20
 **/
public class Client {

    public static void main(String[] args) {
        AbstractDepartment employee1 = new Employee("e1");
        AbstractDepartment employee2 = new Employee("e2");
        AbstractDepartment employee3 = new Employee("e3");
        AbstractDepartment employee4 = new Employee("e4");

        AbstractDepartment department1 = new Department("d1");
        AbstractDepartment department2 = new Department("d2");
        AbstractDepartment department3 = new Department("d3");
        AbstractDepartment company1 = new Department("company1");
        AbstractDepartment company2 = new Department("company2");

        company1.addOne(department1);
        company1.addOne(department2);

        department1.addOne(department3);
        department1.addOne(employee1);
        department2.addOne(employee2);

        company2.addOne(employee2);
        company2.addOne(employee3);
        company2.addOne(employee4);

        company2.addOne(company1);

        company2.sendNotification("today we take a holiday");
    }
}
