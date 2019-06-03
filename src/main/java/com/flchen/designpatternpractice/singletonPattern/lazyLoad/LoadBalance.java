package com.flchen.designpatternpractice.singletonPattern.lazyLoad;

import java.util.LinkedList;
import java.util.List;

/**
 * author fl.chen
 * Date 2019-06-03
 * Time 16:31
 **/
public class LoadBalance {

    private static LoadBalance loadBalance = null;

    List<Service> services = null;

    private LoadBalance() {
        services = new LinkedList();
    }

    public static LoadBalance getInstance() {
        if(null == loadBalance) {
            synchronized (LoadBalance.class) {
                if (null == loadBalance) {
                    loadBalance = new LoadBalance();
                }
            }
        }
        return loadBalance;
    }

    public List<Service> addService(Service service) {
        if (!serviceExist(service)) {
            services.add(service);
        }
        return services;
    }

    public List<Service> removeService(Service service) {
        services.remove(service);
        return services;
    }

    public List<Service> normalServices() {
        List<Service> normalServices = new LinkedList<>();
        services.forEach(e -> {
            if(e.getStatus()) {
                normalServices.add(e);
            }
        });
        return normalServices;
    }

    public Boolean serviceExist(Service service) {
        return services.contains(service);
    }
}
