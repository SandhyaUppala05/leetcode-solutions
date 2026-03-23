/*
Problem: 2053. Kth Distinct String in an Array
Approach: Brute Force (Optimized by skipping duplicates)
Time Complexity: O(n^2)
Space Complexity: O(1)
*/

class Solution {
    public String kthDistinct(String[] arr, int k) {
        int m = 0;
       for(int i=0; i<arr.length; i++){
            boolean b = false;
            for(int p=0; p<i; p++){
                if(arr[i].equals(arr[p])){
                    b=true;
                    break;
                }
            }
            if(b){
                continue;
            }
            int c=0;
            for(int j=0; j<arr.length; j++){
                if(arr[i].equals(arr[j])){
                    c++;
                }
            }
            if(c==1){
                m++;
                if(m==k){
                    return arr[i];
                }
            }
       }
       return "";
    }
}
