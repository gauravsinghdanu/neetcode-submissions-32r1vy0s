class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int first=1;
        for(int num:nums){
            if(num==first){
                first++;
            }
        }
        return first;
    }
}