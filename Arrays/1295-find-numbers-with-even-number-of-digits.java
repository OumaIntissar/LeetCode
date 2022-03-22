/*
    URL to problem: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
*/

class Solution {
    public int findNumbers(int[] nums) {
        int nbOfDigits;
        int nbOfEvenDigits = 0;
        for (int i = 0; i < nums.length; i++){
            nbOfDigits = 0;
            while (nums[i] > 0){
                nums[i] /= 10;
                nbOfDigits ++;
            }
            
            if(nbOfDigits % 2 == 0) nbOfEvenDigits++;
            
        }
        
        return nbOfEvenDigits;
    }
}