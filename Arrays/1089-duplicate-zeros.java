/*
    URL to problem: https://leetcode.com/problems/1089-duplicate-zeros/
*/

class Solution {
    public void duplicateZeros(int[] arr) {
        int arrLen = arr.length;
        for (int i= 0; i < arrLen; i++){
            
            if(arr[i] == 0){
                for (int j= arrLen -1 ; j > i; j--){
                   arr[j] = arr[j-1];
                }
                i= i+1;
            } 
        }
    }
}