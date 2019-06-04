package com.flchen.designpatternpractice.singletonPattern.multiplePattern;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * author fl.chen
 * Date 2019-06-03
 * Time 17:39
 * 如何对单例模式进行改造，使得系统中某个类的对象可以存在有限多个，例如两例或三例？(多例类)
 **/

@Slf4j
@Data
public class MultipleLoadBalance {
    private final static int NUM = 3;
    private final static List<MultipleLoadBalance> multipleLoadBalances = new ArrayList<>();

    private String name;

    private MultipleLoadBalance(String name) {
        this.name = name;
    }

    public static MultipleLoadBalance getInstance() {

        int length = multipleLoadBalances.size();
        if (NUM > length) {
            multipleLoadBalances.add( new MultipleLoadBalance("s" + length));
        }
        Random random = new Random();
        int index = random.nextInt(length + 1);
        return multipleLoadBalances.get(index);
    }

    public static void main(String[] args) {
        MultipleLoadBalance multipleLoadBalance = MultipleLoadBalance.getInstance();
        log.info("multipleLoadBalance --- {}", multipleLoadBalance.getName());

        MultipleLoadBalance multipleLoadBalance1 = MultipleLoadBalance.getInstance();
        log.info("multipleLoadBalance1 --- {}", multipleLoadBalance1.getName());

        MultipleLoadBalance multipleLoadBalance2 = MultipleLoadBalance.getInstance();
        log.info("multipleLoadBalance2 --- {}", multipleLoadBalance2.getName());

        MultipleLoadBalance multipleLoadBalance3 = MultipleLoadBalance.getInstance();
        log.info("multipleLoadBalance3 --- {}", multipleLoadBalance3.getName());

    }
}
