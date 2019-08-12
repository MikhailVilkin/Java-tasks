package com.company;

import java.math.*;

public class Maths
{
    public static void main(String[] args)
    {
        //6
        System.out.println(1 + 2 - 4);
        //7
        double x = 1.0/2 + 1.0/4;
        System.out.printf("1/2 + 1/4 = %f\n", x);
        //8
        int a = 2, b = 3;
        int result = (a + 4*b) * (a - 3*b) + (int)Math.pow((double)a, 2.0);
        System.out.println(result);
        //9
        x = -2;
        System.out.println(Math.abs(x) + Math.pow((double)x, 5.0));
        //10
        double x_2 = 1.7, x_3 = 3.0;
        System.out.println(Math.pow((x_2 + 1), 2.0) + 3 * (x_2 + 1));
        System.out.println(Math.pow((x_3 + 1), 2.0) + 3 * (x_3 + 1));
        //12
        x_2 = 3.6;
        x_3 = Math.exp(x_2 - 2) + Math.abs(Math.sin(x_2)) - Math.pow(x_2, 4.0) * Math.cos(1.0/x_2);
        System.out.println(x_3);
    }
}
