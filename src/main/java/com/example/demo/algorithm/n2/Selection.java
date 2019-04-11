package com.example.demo.algorithm.n2;

import com.example.demo.algorithm.Sort;

/**
 * 快速排序
 * a) 原理：每一趟从待排序的记录中选出最小的元素，顺序放在已排好序的序列最后，直到全部记录排序完毕。
 * 也就是：每一趟在n-i+1(i=1，2，…n-1)个记录中选取关键字最小的记录作为有序序列中第i个记录。
 * 基于此思想的算法主要有简单选择排序、树型选择排序和堆排序。（这里只介绍常用的简单选择排序）
 *
 * b) 简单选择排序的基本思想：给定数组：int[] arr={里面n个数据}；
 * 第1趟排序，在待排序数据arr[1]~arr[n]中选出最小的数据，将它与arrr[1]交换；
 * 第2趟，在待排序数据arr[2]~arr[n]中选出最小的数据，将它与r[2]交换；
 * 以此类推，第i趟在待排序数据arr[i]~arr[n]中选出最小的数据，将它与r[i]交换，直到全部排序完成。
 * @param <T>
 */
public class Selection<T extends Comparable<T>> extends Sort<T> {

    @Override
    public void sort(T[] nums) {
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            int min = i;
            for (int j = i +1; j < length; j++) {
                if (less(nums[j], nums[min])) {
                    min = j;
                }
            }
            if (min != i) {
                swap(nums, min, i);
            }

        }
    }

}
