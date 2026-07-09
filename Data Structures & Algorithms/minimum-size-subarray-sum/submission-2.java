class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minWindow=Integer.MAX_VALUE;
        int currSum=0;

        int l=0,r=0;

        while(r<nums.length){
            currSum+=nums[r];
            r++;

            while(currSum>=target){
                int minLength=r-l;
                minWindow=Math.min(minWindow,minLength);
                currSum-=nums[l];
                l++;
            }
        }
        return minWindow==Integer.MAX_VALUE ? 0:minWindow;
    }
}