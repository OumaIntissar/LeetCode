/*
    URL to problem: https://leetcode.com/problems/squares-of-a-sorted-array/
*/

class Solution {
    public int[] sortedSquares(int[] nums) {
        int numsLen = nums.length;
        int[] sortedSquares = new int[numsLen];
        int right = numsLen -1;
        int left = 0;
        
        for (int i = numsLen -1; i >=0; i--){
            if(Math.abs(nums[left]) > nums[right]){
                sortedSquares[i] = (int) Math.pow(nums[left], 2);
                left ++;
            } else {
                sortedSquares[i] = (int) Math.pow(nums[right], 2);
                right --;
            }
        }
        
        return sortedSquares;
    }
}