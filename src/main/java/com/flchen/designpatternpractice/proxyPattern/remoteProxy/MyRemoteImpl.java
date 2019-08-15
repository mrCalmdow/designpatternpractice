package com.flchen.designpatternpractice.proxyPattern.remoteProxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * author: flchen
 * Date: 2019-08-14
 * Time: 08:47
 *
 * @Description:
 **/
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    protected MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {

        return "Hello, RMI.";
    }

    public static void main(String[] args) {
        try {
            MyRemote server = new MyRemoteImpl();
            Naming.rebind("RemoteHello", server);
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
