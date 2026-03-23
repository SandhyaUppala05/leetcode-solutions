/*
Problem: Largest Even Number from String

Approach:
- Traverse from the end of the string
- Check the last character
- If it is '2', return the string (valid even number)
- Otherwise, remove the last character and continue
- If no '2' is found, return empty string

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public String largestEven(String s) {
        while(!s.isEmpty()){
            char last = s.charAt(s.length()-1);
            if(last == '2'){
                    return s;
            }
            s=s.substring(0, s.length()-1);
        } 
        return "";
            
    }
}
