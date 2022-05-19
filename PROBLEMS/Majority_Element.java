
/*
 * Given an array nums of size n, return the majority element.
 * 
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You
 * may assume that the majority element always exists in the array.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [3,2,3]
 * Output: 3
 */
import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        // Creating a HashMap containing integer
        // as a key and occurrences as a value
        HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (freqMap.containsKey(nums[i])) {

                // If number is present in freqMap,
                // incrementing it's count by 1
                freqMap.put(nums[i], freqMap.get(nums[i]) + 1);
            } else {

                // If integer is not present in freqMap,
                // putting this integer to freqMap with 1 as it's value
                freqMap.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }
        return 0;
    }

}
