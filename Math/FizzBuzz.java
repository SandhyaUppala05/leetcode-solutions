import java.util.*;

/*
Problem: FizzBuzz
Difficulty: Easy

Description:
Return a string array where:
- "Fizz" for multiples of 3
- "Buzz" for multiples of 5
- "FizzBuzz" for multiples of both
- Number otherwise

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> f = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                f.add("FizzBuzz");
            } else if (i % 3 == 0) {
                f.add("Fizz");
            } else if (i % 5 == 0) {
                f.add("Buzz");
            } else {
                f.add(String.valueOf(i));
            }
        }
        return f;
    }
}
