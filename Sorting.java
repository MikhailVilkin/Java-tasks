package com.company;

import java.math.*;
import java.util.Date;

public class Sorting
{
    public static void main(String[] args)
    {
        final int N = 20;
        int[] mas;
        mas = new int[N];
        for (int i = 0; i < N; i++)
            mas[i] = (int)(Math.random() * System.currentTimeMillis() / 100000000);
        for (int i: mas)
            System.out.print(i + ", ");

        Array m = new Array();
        m.quick_sort(mas, 0, N-1);

        System.out.println();
        for (int i: mas)
            System.out.print(i + ", ");
    }
}

class Array
{
    public void simple_sort(int[] mas)
    {
        //Сортировка вставками
        int tmp;
        for (int i = 1; i<mas.length; i++)
        {
            tmp = mas[i];
            for (int j = i-1; j>=0; j--)
            {
                if(mas[j] > tmp)
                    mas[j+1] = mas[j];
                else {
                    mas[j+1] = tmp;
                    break;
                }
                mas[j] = tmp;
            }
        }
    }

    public void quick_sort(int[] mas, int left, int right) {
        int p; //опорный элемент
        int l = left, r = right;

        p = mas[l];
        while (left < right) {
            while ((mas[right] >= p) && (left < right))
                right--;
            if (left != right) {
                mas[left] = mas[right];
                left++;
            }
            while ((mas[left] <= p) && (left < right))
                left++;
            if (left != right) {
                mas[right] = mas[left];
                right--;
            }
        }
        mas[left] = p;
        p = left;

        if (l < p)
            quick_sort(mas, l, p - 1);
        if (r > p)
            quick_sort(mas, p + 1, r);
    }

}
