/*
You are given a sorted unique integer array nums.

A range [a,b] is the set of all integers from a to b (inclusive).

Return the smallest sorted list of ranges that cover 
all the numbers in the array exactly. 
That is, each element of nums is covered by exactly one of the ranges, 
and there is no integer x such that x is in one of the ranges but not in nums.
*/

import java.util.*;

public class Summary_Ranges {
    public List<String> summaryRanges(int[] nums) {
        int j = 0;
        List<String> result = new ArrayList<String>();
        int n = nums.length;
        int i = 0;
        if (n == 1) {
            result.add(Integer.toString(nums[0]));
        } else {
            while (i < n - 1) {
                if (nums[i + 1] == nums[i] + 1) {
                    j = i;
                    while (j < n - 1 && nums[j] + 1 == nums[j + 1]) {
                        j = j + 1;
                    }
                    result.add(Integer.toString(nums[i]) + "->" + Integer.toString(nums[j]));
                    i = j + 1;
                } else {
                    result.add(Integer.toString(nums[i]));
                    i = i + 1;
                }
                if (j != n - 1 && i == n - 1) {
                    result.add(Integer.toString(nums[i]));
                }
            }
        }
        return result;
    }
}
