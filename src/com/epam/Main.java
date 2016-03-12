package com.epam;

/**
 * Created by Hrinchenko on 12.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        Integer x1 = 130;
        Integer x2 = new Integer(130);
        Integer x3 = Integer.valueOf(130);
        Integer x4 = Integer.parseInt("130");
        Integer x5 = Integer.valueOf("130");

        System.out.println(x1 == x3);
        System.out.println(x1.equals(x2));
        System.out.println(x3 ==x4);
        System.out.println(x4 ==x5);
        System.out.println(x4==x2);
        System.out.println(x4.equals(x2));




    }
}
