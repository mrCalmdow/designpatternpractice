package com.flchen.designpatternpractice.compositePattern;

import org.springframework.util.CollectionUtils;

import java.util.Iterator;
import java.util.Stack;

/**
 * author: flchen
 * Date: 2019-08-04
 * Time: 21:48
 *
 * @Description:
 **/
public class MenuComponetIterator implements Iterator {

    Stack<Iterator<MenuComponet>> stack = new Stack<>();

    public MenuComponetIterator(Iterator<MenuComponet> iterator) {
        stack.push(iterator);
    }
    @Override
    public boolean hasNext() {
        if (CollectionUtils.isEmpty(stack)) {
            return false;
        } else {
            Iterator<MenuComponet> iterator = stack.peek();
            if (!iterator.hasNext()) {
                /**
                 * 如果stack中的iterator为空，则说明此iterator为空，弹出抛弃
                 */
                stack.pop();
                return hasNext();
            }
            return true;
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator<MenuComponet> iterator = stack.peek();
            MenuComponet next = iterator.next();
            if (next instanceof Menu) {
                // 递归
                stack.push(next.createMenuComponetIterator());
            }
            return next;
        } else {
            return null;
        }
    }

}
