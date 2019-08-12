package com.company;

import java.util.Scanner;

public class Swap
{
    public static void main(String[] args)
    {
        int a, b;
        Scanner inp = new Scanner(System.in);
        a = inp.nextInt();
        b = inp.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " " + b);
    }
}
