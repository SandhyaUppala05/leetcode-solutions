/*
Problem: Palindrome Number

Approach:
- Negative numbers are not palindrome
- Numbers ending with 0 (except 0) are not palindrome
- Reverse the number and compare with original

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int duplicate = x, reversed=0;
        while(duplicate>0){
            int r = duplicate%10;
            reversed=reversed*10+r;
            duplicate/=10;
        }
        return reversed==x;
    }
}
