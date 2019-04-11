package com.example.demo;

import com.example.demo.algorithm.n2.Bubble;
import com.example.demo.algorithm.Sort;
import com.example.demo.algorithm.nlogn.MergeSort;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Integer[] array = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        Sort selection = new MergeSort();
        selection.sort(array);
        //System.out.println(Arrays.toString(array));
    }

}
