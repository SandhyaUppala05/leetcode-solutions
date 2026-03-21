// LeetCode 125: Valid Palindrome
// Approach: Clean string + Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
        int n = str.length();
        int l = 0;
        int r = n-1;
        str = str.toLowerCase();
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
