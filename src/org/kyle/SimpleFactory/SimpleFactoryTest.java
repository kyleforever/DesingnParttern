package org.kyle.SimpleFactory;

/**
 * Created by longli on 06/03/17.
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        Product product = ConcreateCreator.createProduct(ConcreateProductA.class);
        product.featureA();
        product.featureB();

        product = ConcreateCreator.createProduct(ConcreateProductB.class);
        product.featureA();
        product.featureB();
    }
}
