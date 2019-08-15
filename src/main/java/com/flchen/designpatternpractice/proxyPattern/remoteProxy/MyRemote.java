package com.flchen.designpatternpractice.proxyPattern.remoteProxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * author: flchen
 * Date: 2019-08-14
 * Time: 08:45
 *
 * @Description:
 **/
public interface MyRemote extends Remote {

    public String sayHello() throws RemoteException;
}
