// Problem: 2108. Find First Palindromic String in the Array
// Approach: Traverse array and check each string using two-pointer palindrome check
// Time Complexity: O(n * m)
// Space Complexity: O(1)

class Solution {
    public String firstPalindrome(String[] words) {

        for(String word: words){
            if(isPalindrome(word)){
                return word;
            }
        }
        return "";
    }
    public static boolean isPalindrome(String s){
        int l = 0;
        int r = s.length()-1;
    
        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            r--;
            l++;
        }
        return true;
    }
}
