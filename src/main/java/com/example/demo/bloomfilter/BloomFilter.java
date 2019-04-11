package com.example.demo.bloomfilter;

public class BloomFilter {

    private int[] arrays;

    private int arraySize;

    public BloomFilter(int arraySize) {
        this.arraySize = arraySize;
        arrays = new int[arraySize];
    }

    /**
     * 添加元素
     */
    public void add(String key){
        arrays[hashcode_1(key) % arraySize] = 1;
        arrays[hashcode_2(key) % arraySize] = 1;
        arrays[hashcode_3(key) % arraySize] = 1;
    }

    /**
     * 校验是否存在
     * @return
     */
    public boolean check(String key){
        int first = arrays[hashcode_1(key) % arraySize];
        int second = arrays[hashcode_2(key) % arraySize];
        int third = arrays[hashcode_3(key) % arraySize];

        if (first == 0 || second == 0 || third == 0 )
            return false;

        return true;


    }

    private int hashcode_1(String key){
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = 33 * hash + key.charAt(i);
        }
        return Math.abs(hash);
    }

    private int hashcode_2(String key){
        final int p = 16777619;
        int hash = (int) 2166136261L;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash ^ key.charAt(i)) * p;
        }
        hash += hash << 13;
        hash ^= hash >> 7;
        hash += hash << 3;
        hash ^= hash >> 17;
        hash += hash << 5;
        return Math.abs(hash);

    }

    private int hashcode_3(String key){
        int hash, i;
        for (hash = 0, i = 0; i < key.length(); ++i) {
            hash += key.charAt(i);
            hash += (hash << 10);
            hash ^= (hash >> 6);
        }
        hash += (hash << 3);
        hash ^= (hash >> 11);
        hash += (hash << 15);
        return Math.abs(hash);
    }

}
