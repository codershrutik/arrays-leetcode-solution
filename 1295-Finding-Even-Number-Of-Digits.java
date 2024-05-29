//Link to problem - https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
class Solution {
    public int findNumbers(int[] nums) {

        int count = 0;
       
        for(int num: nums){
            int countn = 0;
            int n = num;
            while (n != 0) {
                n /= 10;
                ++countn;
            }
            if(countn % 2 == 0){
                count++;
            }
        }
        return count;
    }
}