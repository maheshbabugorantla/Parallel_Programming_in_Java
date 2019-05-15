package com.example.mgorantla;

import java.util.concurrent.RecursiveAction;

public class IncrementArray extends RecursiveAction {

    final long[] array;
    final int low, high;

    public IncrementArray(long[] array, int low, int high) {
        this.array = array;
        this.low = low;
        this.high = high;
    }

    @Override
    protected void compute() {

    }
}
