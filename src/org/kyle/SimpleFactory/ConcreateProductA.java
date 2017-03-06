package org.kyle.SimpleFactory;

/**
 * Created by longli on 06/03/17.
 */
public class ConcreateProductA extends Product {
    @Override
    public void featureA() {
        System.out.println("Product A's feature A");
    }

    @Override
    public void featureB() {
        System.out.println("Product A's feature B");
    }
}
