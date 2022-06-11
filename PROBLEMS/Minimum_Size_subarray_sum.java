/*
 * Given an array of positive integers nums and a positive integer target,
 * return the minimal length of a contiguous subarray [numsl, numsl+1, ...,
 * numsr-1, numsr] of which the sum is greater than or equal to target. If there
 * is no such subarray, return 0 instead.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: target = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: The subarray [4,3] has the minimal length under the problem
 * constraint.
 * 
 * Example 2:
 * 
 * Input: target = 4, nums = [1,4,4]
 * Output: 1
 * 
 * Example 3:
 * 
 * Input: target = 11, nums = [1,1,1,1,1,1,1,1]
 * Output: 0
 * 
 */

class Minimum_Size_subarray_sum_java {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int minlength = Integer.MAX_VALUE, currsum = 0;
        for (int j = 0; j < nums.length; j++) {
            currsum += nums[j];
            while (currsum > target && i < j) {
                minlength = Math.min(j - i + 1, minlength);
                currsum -= nums[i++];
            }
            if (currsum >= target)
                minlength = Math.min(j - i + 1, minlength);
        }
        return (minlength == Integer.MAX_VALUE) ? 0 : minlength;
    }
}