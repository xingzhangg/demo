package com.example.demo.algorithm.n2;

import com.example.demo.algorithm.Sort;

/**
 * 插入排序
 * 基本思想是每一步将一个待排序的记录，插入到前面已经排好序的有序序列中去，直到插完所有元素为止。
 * @param <T>
 */
public class Insertion<T extends Comparable<T>> extends Sort<T> {

    @Override
    public void sort(T[] nums) {
        int length = nums.length;
        for (int i = 1; i < length; i++) {
            int j = i;
            while (j > 0 && less(nums[j], nums[j-1])){
                swap(nums, j , j-1);
                j--;
            }

        }
    }
}
