package org.kyle.SimpleFactory;

/**
 * Created by longli on 06/03/17.
 */
public class ConcreateCreator {
    public static <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) c.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return (T)product;
    }
}
