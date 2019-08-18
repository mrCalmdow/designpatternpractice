package com.flchen.testDemos;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * author: flchen
 * Date: 2019-08-13
 * Time: 20:16
 *
 * @Description:
 **/
@Slf4j
public class TestDemo1 {

    public static void main(String[] args) {
        System.out.println("Hello, TestDemo.");

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ints = twoSum(nums, target);
        log.error("result[0] = {}, result[1] = {}", ints[0], ints[1]);

        ints = twoSum1(nums, target);
        log.error("result[0] = {}, result[1] = {}", ints[0], ints[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for(int i = 0; i < len -1; i++) {
            for(int j = i +1; j < len; j++) {
                if (target == nums[i] +nums[j]) {
                    int[] result = new int[2];
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }

    public static int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                int j = map.get(target - nums[i]);
                if (i != j) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
