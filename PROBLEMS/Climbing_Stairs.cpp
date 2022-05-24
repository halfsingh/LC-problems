/*You are climbing a staircase. 
It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. 
In how many distinct ways can you climb to the top?
*/

class Solution {
   public:
    int climbStairs(int n) {
        unordered_map<int, int> memo;
		
		// setup two basecases, we include them here so we don't need to check later
        memo[1] = 1;
        memo[2] = 2;

        recurr(n, memo);
		
        return memo[n];
    }

    int recurr(int n, unordered_map<int, int> &memo) {
		// check if element already in the dp table, the base case is contained in the table
        if (memo.find(n) != memo.end()) {
            return memo[n];
        }
		
		// the number of ways to reach nth stair is the number of ways to reach n - 1 th stair +  n - 2 th stair
        memo[n] = recurr(n - 1, memo) + recurr(n - 2, memo);

        return memo[n];
    }
};