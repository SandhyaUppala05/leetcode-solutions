/*
Problem: 20. Valid Parentheses
Approach: Stack
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> obj = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                obj.push(ch);
            }
            else{
                if (obj.isEmpty()) {
                    return false;
                    
                }

                char top = obj.pop();

         
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    
                    return false;
            
                }
            }
        }

        return obj.isEmpty();
		
    }
}
