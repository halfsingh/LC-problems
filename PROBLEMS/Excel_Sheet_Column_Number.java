
/*Given a string columnTitle that represents the 
column title as appears in an Excel sheet,
 return its corresponding column number.

*/

public class Excel_Sheet_Column_Number {
    public int titleToNumber(String s) {
        if (s == null)
            return -1;
        int sum = 0;
        // for each loop so we don't need to mess with index values.
        for (char c : s.toUpperCase().toCharArray()) {
            sum *= 26;
            sum += c - 'A' + 1;
        }
        return sum;
    }

}

/*
 * Think of this problem as the same way you'd manually
 * take a binary string and calculate it's decimal representation.
 * Instead of being base 2 it is base 26.
 * 
 */
