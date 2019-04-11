package com.example.demo.algorithm.nlogn;

import com.example.demo.algorithm.Sort;

import java.util.Arrays;

/**
 * 归并排序
 * @param <T>
 */
public class MergeSort<T extends Comparable<T>> extends Sort<T> {

    @Override
    public void sort(T[] arrays) {
        int[] nums = new int[]{2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        int[] newNums = new int[nums.length];
        sort(nums, 0, nums.length - 1, newNums);
        System.out.println(Arrays.toString(newNums));
    }

    /**
     *
     * @param nums
     * @param left
     * @param right
     * @param temp
     */
    private void sort(int[] nums, int left, int right, int[] temp){
        if (left < right) {
            int mid = (left + right) / 2;
            sort(nums, left, mid, temp);
            sort(nums, mid+1, right, temp);
            merge(nums, left, mid, right, temp);
        }
    }

    private void merge(int[] arr, int left , int mid, int right, int[] temp){
        int i = left; //左序列指针
        int j = mid + 1; //右序列指针
        int t = 0;//临时数组指针
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[t++] = arr[i++];
            }else{
                temp[t++] = arr[j++];
            }
        }
        while (i <= mid) {//将左边剩余元素填充进temp中
            temp[t++] = arr[i++];
        }
        while (j <= right) {//将右序列剩余元素填充进temp中
            temp[t++] = arr[j++];
        }
        t = 0;
        while (left <= right) {  //将temp中的元素全部拷贝到原数组中
            arr[left++] = temp[t++];
        }
    }


}
