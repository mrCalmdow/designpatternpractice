package com.flchen.designpatternpractice.proxyPattern.dynamicProxy;

/**
 * author: flchen
 * Date: 2019-08-18
 * Time: 21:12
 *
 * @Description:
 **/
public interface PersonBean {

    String getName();
    String getGender();
    String getInterests();
    int getHotOrNotRating();


    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating(int rating);

}
