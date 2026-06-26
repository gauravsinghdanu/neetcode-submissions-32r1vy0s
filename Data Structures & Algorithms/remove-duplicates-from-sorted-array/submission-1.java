class Solution {
    public int removeDuplicates(int[] nums) {
       int z=1;
       for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[i-1]){
            nums[z++]=nums[i];
        }
       }
       return z; 
    }
}