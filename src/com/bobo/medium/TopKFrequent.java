package com.bobo.medium;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by evildoerDb on 2018/8/23 14:39
 *
 * Given a non-empty array of integers, return the k most frequent elements.
 *
 * Example 1:
 *
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * Example 2:
 *
 * Input: nums = [1], k = 1
 * Output: [1]
 *
 *
 */
public class TopKFrequent {

    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        //index作为出现的次数  value作为数字  防止重复 使用list
        for (int key : map.keySet()) {
            int frequency = map.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        List<Integer> res = new ArrayList<>();

        //从最右边向左边取k个元素
        for (int pos = bucket.length - 1; pos >= 0 && res.size() < k; pos--) {
            if (bucket[pos] != null) {
                res.addAll(bucket[pos]);
            }
        }
        return res;
    }


    /**
     * jdk 1.8中的流式写法
     * @param nums
     * @param k
     * @return
     */
    public static List<Integer> topKFrequent1(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
//            counter.putIfAbsent(num, 0);
//            counter.computeIfPresent(num, (key, oldVal) -> oldVal + 1);
            counter.put(num,counter.getOrDefault(num,0) + 1);
        }
        return counter.entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry<Integer, Integer>::getValue).reversed())
                .limit(k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    /**
     * 使用优先级队列
     * @param nums
     * @param k
     * @return
     */
    public static List<Integer> topKFrequent2(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> ret = new ArrayList<>();
        for (int n : nums) {
            if (countMap.containsKey(n)) {
                countMap.put(n ,countMap.get(n)+1);
            } else {
                countMap.put(n ,1);
            }
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq =
                new PriorityQueue<Map.Entry<Integer, Integer>>((o1, o2) -> o2.getValue() - o1.getValue());
        pq.addAll(countMap.entrySet());

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < k; i++){
            list.add(pq.poll().getKey());
        }
        return list;
    }
}
