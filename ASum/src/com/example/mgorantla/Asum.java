package com.example.mgorantla;

import java.util.concurrent.RecursiveAction;

public class Asum extends RecursiveAction {

    private int[] A;
    private int low, high;
    private int sum;

    public Asum(int[] A) {
        this.A = A;
        this.low = 0;
        this.high = A.length;
        this.sum = 0;
    }

    public Asum(int[] A, int low, int high) {
        this.A = A;
        this.low = low;
        this.high = high;
        this.sum = 0;
    }

    private void sum(int[] A, int low, int high) {
        for (int index = low; index < high; index++) {
            this.sum += A[index];
        }
    }

    public int getSum() {
        return this.sum;
    }

    @Override
    protected void compute() {
        if ((high - low) <= 10) {
            sum(A, low, high);
        }
        else {
            int split = (low + high) >> 1;
            Asum left_part = new Asum(A, low, split);
            Asum right_part = new Asum(A, split, high);
            invokeAll(left_part, right_part);
            sum = left_part.getSum() + right_part.getSum();
        }
    }
}