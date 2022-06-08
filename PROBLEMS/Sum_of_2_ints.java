/*
 * Given two integers a and b, 
 * return the sum of the two integers 
 * without using the operators + and -.
 * 
 * 
 * Example 1:
 * Input: a = 1, b = 2
 *  Output: 3
 */

public class Sum_of_2_ints {
    public int getSum(int a, int b) {
        return b == 0 ? a : getSum(a ^ b, (a & b) << 1);
    }
}

/*
 * 
 * 
 * I find this a bit tricky to explain,
 * but here's an attempt;
 * think bit by bit addition, there are only 4 cases;
 * 
 * 0+0=0
 * 0+1=1
 * 1+0=1
 * 1+1=0 (and generates carry)
 * 
 * The two lines handle different cases
 * 
 * sum = a ^ b
 * 
 * Handles case 0+1 and 1+0,
 * sum will contain the simple case,
 * all bit positions that add up to 1.
 * 
 * carry = (a & b) << 1
 * 
 * The (a & b) part finds all bit positions with the case 1+1.
 * Since the addition results in 0, it's the carry that's important,
 * and it's shifted to the next position to the left (<<1).
 * The carry needs to be added to that position,
 * so the algorithm runs again.
 * 
 * The algorithm repeats until there are no more carries, in which case sum will
 * contain the correct result.
 * 
 * 
 * 
 */