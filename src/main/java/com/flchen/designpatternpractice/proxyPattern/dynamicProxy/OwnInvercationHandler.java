package com.flchen.designpatternpractice.proxyPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * author: flchen
 * Date: 2019-08-18
 * Time: 21:37
 *
 * @Description:
 **/
public class OwnInvercationHandler implements InvocationHandler {

    private PersonBean personBean;

    public OwnInvercationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.getName().startsWith("get")) {
            return method.invoke(personBean, args);
        } else if (method.getName().startsWith("setHotOrNotRating")) {
            throw new IllegalAccessException("Can't set own hotOrNOtRating.");
        } else if(method.getName().startsWith("set")) {
            return method.invoke(personBean, args);
        }
        return null;
    }
}
