package org.kyle.Factory;

/**
 * Created by longli on 06/03/17.
 */
public class FactoryTest {
    public static void main(String[] args) {
        Creator creator = new ConcreateCreator();
        Product product = creator.createProduct(ConcreateProductA.class);
        product.featureA();
        product.featureB();

        product = creator.createProduct(ConcreateProductB.class);
        product.featureA();
        product.featureB();
    }
}
