package com.example.demo.algorithm;

public abstract class Sort<T extends Comparable<T>> {

    public abstract void sort(T[] nums);

    protected boolean less(T v , T w){
        return v.compareTo(w) < 0;
    }

    protected boolean greater(T v , T w){
        return v.compareTo(w) > 0;
    }

    protected void swap(T[] nums, int i , int j){
        T temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
