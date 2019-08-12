package com.company;

import java.util.Scanner;

public class WPrint
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt() - 1;
        int w = n*4 - 4;

        System.out.print("*");
        for (int j = 0; j<=w/2; j++)
            System.out.print(" ");
        System.out.print("*");
        for (int j = 0; j<=w/2 + 1; j++)
            System.out.print(" ");
        System.out.println("*");

        for (int i = 1; i<n; i++)
        {
            for (int j = 0; j < i; j++)
                System.out.print(" ");
            System.out.print("*");
            for (int j = 0; j < (w/2 - 2*i)+1; j++)
                System.out.print(" ");
            System.out.print("*");
            for (int j = 0; j < 2*i; j++)
                System.out.print(" ");
            System.out.print("*");
            for (int j = 0; j < (w/2 - 2*i)+1; j++)
                System.out.print(" ");
            System.out.println("*");
        }

        for (int j = 0; j<n; j++)
            System.out.print(" ");
        System.out.print("*");
        for (int j = 0; j<=2*(n-1)+1; j++)
            System.out.print(" ");
        System.out.print("*");
    }
}
