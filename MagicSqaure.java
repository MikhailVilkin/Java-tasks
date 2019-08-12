package com.company;

        import java.math.*;
        import java.util.*;

public class MagicSqaure
{
    public static void main(String[] args)
    {
        try {
            Scanner inp = new Scanner(System.in);
            final int N = inp.nextInt();
            if (N<3)
                throw new Exception("Минимальная размерность - 3");
            Matrix m = new Matrix(N);
            m.make_magic();
            m.print_matrix();
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

class Matrix
{
    int N, Matrix_sum;
    int[][] Matr;
    Matrix(int N)
    {
        this.N = N;
        Matr = new int[N][N];
        Matrix_sum = N*(N*N + 1)/2;
    }

    void make_magic()
    {
        switch(N%2)
        {
            case 0:
                this.odd_magic();
                break;
            default:
                this.even_magic();
        }
    }

    void print_matrix()
    {
        for(int i = 0; i<N; i++)
        {
            for(int j=0; j<N; j++)
                System.out.print(Matr[i][j] + "  ");
            System.out.println();
        }
    }

    void odd_magic()
    {
        System.out.println("У меня нет алгоритма для этого");
    }

    void even_magic()
    {
        for (int i=0; i<N; i++) {
            for (int j = 0; j < N; j++)
                Matr[i][j] = 0;
        }
        int i = 0, j = N/2;

        for (int k = 1; k<=N*N; k++) {
            Matr[i][j] = k;
            i--;
            j++;
            if (k % N == 0) {
                i += 2;
                --j;
            } else if (j == N)
                j -= N;
            else if (i < 0)
                i += N;
        }
    }
}
