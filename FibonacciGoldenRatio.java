package com.company;

import java.math.*;

public class FibonacciGoldenRatio
{
    public static void main(String[] args)
    {
        for (int i = 3; i < 20; i++)
        {
            System.out.println((int)(((Math.pow((1 + Math.sqrt(5.0))/2, (double)i)) -
                    (Math.pow((1 - Math.sqrt(5.0))/2, (double)i))) / Math.sqrt(5.0)));
        }
    }
}
