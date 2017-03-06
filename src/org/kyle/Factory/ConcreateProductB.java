package org.kyle.Factory;

/**
 * Created by longli on 06/03/17.
 */
public class ConcreateProductB extends Product {
    @Override
    public void featureA() {
        System.out.println("Product B's feature A");
    }

    @Override
    public void featureB() {
        System.out.println("Product B's feature B");
    }
}
