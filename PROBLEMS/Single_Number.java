
public class Single_Number {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}

/*
 * I'm sure for a lot of people this may be confusing as to why this works.
 * The idea hinges on 3 properties of xor.
 * (1) that its a commutative operation
 * (i.e. a xor b = b xor a).
 * (2) that something xor itself is 0. So a xor a = 0. And
 * (3) 0 xor a = a. These three properties mean that
 * 
 * a xor b xor a = a xor a xor b = 0 xor b = b.
 * 
 * Thus it doesn't matter the order of the numbers.
 * If something only occurs once it won't get negated.
 */