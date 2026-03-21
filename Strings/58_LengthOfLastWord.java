// LeetCode 58: Length of Last Word
// Approach: Trim + Split
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String str[] = s.split(" ");
        return str[str.length-1].length();
    }
}
