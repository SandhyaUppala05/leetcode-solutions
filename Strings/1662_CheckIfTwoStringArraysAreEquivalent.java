// Problem: 1662. Check If Two String Arrays are Equivalent
// Approach: Concatenate both arrays using StringBuilder and compare
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();

        for(String word:word1){
            s1.append(word);
        }
        StringBuilder s2 = new StringBuilder();

        for(String word:word2){
            s2.append(word);
        }

        return s1.toString().equals(s2.toString());
    }
}
