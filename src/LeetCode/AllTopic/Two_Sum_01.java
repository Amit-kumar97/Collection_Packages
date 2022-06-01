package LeetCode.AllTopic;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
 */

import java.util.HashMap;
import java.util.Map;

public class Two_Sum_01 {
    public int[] twoSum(int[] nums, int target) {
        int[] ar = new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                ar[0] = i;
                ar[1] = map.get(nums[i]);
            }
            else {
                map.put(target - nums[i], i);
            }
        }
        return ar;
    }

}
