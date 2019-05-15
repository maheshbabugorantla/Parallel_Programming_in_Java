package com.example.mgorantla;

import com.example.mgorantla.Asum;

import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {

        int[] A = new int[100];

        for (int index=0; index < A.length; index++) {
            A[index] = index + 1;
        }

        Asum asum = new Asum(A);
        ForkJoinPool fjp = new ForkJoinPool();

        fjp.invoke(asum);

        System.out.println("Sum of first 100 integers is " + asum.getSum());
    }
}
