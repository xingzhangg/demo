package com.example.demo.bloomfilter;

import com.google.common.hash.Funnels;
import org.springframework.util.Assert;

import java.util.HashSet;
import java.util.Set;

public class TestBlommFilter {
    public static void main(String[] args) {
        long star = System.currentTimeMillis();

        testGuavaBloomFilter();
        long end = System.currentTimeMillis();
        System.out.println("执行时间：" + (end - star));
    }


    public static void testGuavaBloomFilter(){
        com.google.common.hash.BloomFilter<Integer> bloomFilter = com.google.common.hash.BloomFilter.create(Funnels.integerFunnel(), 1000000, 0.01);
        for (int i = 0; i < 10000000; i++) {
            bloomFilter.put(i);
        }
        Assert.isTrue(bloomFilter.mightContain(1));
        Assert.isTrue(bloomFilter.mightContain(2));
        Assert.isTrue(bloomFilter.mightContain(3));
        Assert.isTrue(bloomFilter.mightContain(10000000));
    }

    public static void testBloomFilter() {
        BloomFilter bloomFilter = new BloomFilter(10000000);
        for (int i = 0; i < 10000000; i++) {
            bloomFilter.add(i+"") ;
        }
        Assert.isTrue(bloomFilter.check(1+""));
        Assert.isTrue(bloomFilter.check(2+""));
        Assert.isTrue(bloomFilter.check(3+""));
        Assert.isTrue(bloomFilter.check(999999+""));
        Assert.isTrue(bloomFilter.check(400230340+""));
    }

    public static void testHashSet(){
        Set<Integer> hashset = new HashSet<>(10000000) ;
        for (int i = 0; i < 1000000; i++) {
            hashset.add(i) ;
        }
        Assert.isTrue(hashset.contains(1));
        Assert.isTrue(hashset.contains(2));
        Assert.isTrue(hashset.contains(3));
    }


}
