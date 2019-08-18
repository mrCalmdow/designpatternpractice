package com.flchen.designpatternpractice.proxyPattern.dynamicProxy;

/**
 * author: flchen
 * Date: 2019-08-18
 * Time: 21:23
 *
 * @Description:
 **/
public class PersonBeanImpl implements PersonBean {

    private String name;

    private String gender;

    private String interests;

    private int hotOrNotRating;

    private int rateCounting = 0;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getGender() {
        return this.gender;
    }

    @Override
    public String getInterests() {
        return this.interests;
    }

    @Override
    public int getHotOrNotRating() {
        return this.hotOrNotRating;
    }

    @Override
    public void setName(String name) {

        this.name = name;
    }

    @Override
    public void setGender(String gender) {

        this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {

        this.interests = interests;
    }

    @Override
    public void setHotOrNotRating(int rating) {

        this.hotOrNotRating = rating;
        this.rateCounting++;
    }
}
