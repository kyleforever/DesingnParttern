package org.kyle.others;

/**
 * Created by hasee on 2017/2/19.
 */
public class FinallyTest {

    public static void main(String args[]) {
        System.out.print("result is : " + add(15,20));
    }

    public static int add(int a, int b){
        try {
        return a + b;
        }catch (Exception e) {
            System.out.println("Catch block");
        }finally {
            System.out.println("Finally block");
        }
        return 0;
    }
}
