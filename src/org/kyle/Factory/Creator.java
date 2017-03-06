package org.kyle.Factory;

/**
 * Created by longli on 06/03/17.
 */
public abstract class Creator {
    public abstract <T extends Product> T createProduct (Class<T> c);
}
