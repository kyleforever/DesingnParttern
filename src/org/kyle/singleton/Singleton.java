package org.kyle.singleton;

/**
 * Created by hasee on 2017/2/6.
 */
public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
