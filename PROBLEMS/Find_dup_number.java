
/*
 * Given an array of integers nums containing
 * n + 1 integers where each integer is in the range [1, n] inclusive.
 * 
 * There is only one repeated number in nums,
 * return this repeated number.
 * Example 1:
 * 
 * Input: nums = [1,3,4,2,2]
 * Output: 2
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * Naive Java method
 * O(nlogn)
 */
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return 0;
    }

    /*
     * Hash Java method
     * O(n)
     */

    public int findDuplicatetoo(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();
        for (int num : nums) {
            if (seen.contains(num))
                return num;
            seen.add(num);
        }
        return -1;
    }
}