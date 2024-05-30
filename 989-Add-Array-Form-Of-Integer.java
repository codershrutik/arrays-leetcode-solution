//Link to problem - https://leetcode.com/problems/add-to-array-form-of-integer/description/
import java.util.*;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> result = new ArrayList<Integer>();
        int carry = 0;
        int i = num.length - 1;

        while(i >= 0 || k>0){
            if(i>=0){
                carry += num[i];
                i--;
            }
            if(k>0){
                carry += k%10;
                k/=10;
            }

            result.add(carry%10);
            carry /= 10;
        }

        if(carry>0){
            result.add(carry);
        }

        Collections.reverse(result);
        return result;
    }
}