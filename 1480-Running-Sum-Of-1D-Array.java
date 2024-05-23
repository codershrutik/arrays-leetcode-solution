class Solution {
    public int[] runningSum(int[] nums) {
        
        int ans[] = new int[nums.length];
        int a = 0;
        
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i];
            if (i > 0) {
                ans[i] = ans[i] + ans[i - 1];
            }
        }
        return ans;
    }
}
