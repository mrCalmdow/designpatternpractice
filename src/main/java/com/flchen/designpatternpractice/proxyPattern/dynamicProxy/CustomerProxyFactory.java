package com.flchen.designpatternpractice.proxyPattern.dynamicProxy;

import java.lang.reflect.Proxy;
import java.security.acl.NotOwnerException;

/**
 * author: flchen
 * Date: 2019-08-18
 * Time: 22:08
 *
 * @Description:
 **/
public class CustomerProxyFactory {

    public static PersonBean getOwnPersonBeanProxy(PersonBean personBean) {
        Object o = Proxy.newProxyInstance(
            personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new OwnInvercationHandler(personBean)
        );
        return (PersonBean) o;
    }

    public static PersonBean getNotOwnPersonBeanProxy(PersonBean personBean) {

        Object o = Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new NotOwnInvorcationHandler(personBean)
        );
        return (PersonBean) o;
    }
}
