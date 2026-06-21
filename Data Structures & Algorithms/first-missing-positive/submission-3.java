class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int f=1;
        for(int num:nums){
            if(num==f){
                f++;
            }
        }
        return f;
    }
}