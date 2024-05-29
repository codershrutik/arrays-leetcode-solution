//Link to problem - https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
import java.util.Arrays;

class Solution {
    public int findNumbers(int[] nums) {

        int count = 0;
        int countn = 0;
        
        for(int i=0;i<nums.length;i++){
            while (nums[i] != 0) {
                nums[i] /= 10;
                ++countn;
            }
            if(countn % 2 == 0){
                count++;
            }

        }
        return count;
    }
}