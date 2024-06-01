// write a java program to handle user defined exception in divide by zero.

import java.util.*;

public class third {
    public static void dividebyZeroException() {
        System.out.println("Arithmetic exception occured.");
    }
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        try {
            int x = 10;
            int y = 0;
            if(y.equals(0)) throw new dividebyZeroException();
            else System.out.println(x/y);
        } catch(ArithmeticException e) {
            e.printStackTrace();
            System.out.println("******");
        }
    }
}