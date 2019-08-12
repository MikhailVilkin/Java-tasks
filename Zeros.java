package com.company;


public class Zeros
{
    public static void main(String[] args)
    {
        final int n = 10;
        String zeros = "0";
        for (int i = 0; i<n; i++)
        {
            System.out.println(zeros);
            zeros += "0";
        }
    }
}
