package com.flchen.designpatternpractice.createPatterns.prototypePattern.deepClone;

import lombok.Data;

import java.io.*;

/**
 * author fl.chen
 * Date 2019-06-03
 * Time 20:15
 **/

@Data
public class Customer implements Serializable , Cloneable {

    private String name;

    private Address addresses;

    private Integer age;

    public Customer clone() {
        try {
            return (Customer) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Customer deepClone() {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        try {
            ObjectInputStream ois = new ObjectInputStream(bais);
            return (Customer) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
