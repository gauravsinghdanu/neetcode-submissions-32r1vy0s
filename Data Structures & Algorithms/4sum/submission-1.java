class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                for(int k=j+1;k<nums.length-1;k++){
                    for(int l=k+1;l<nums.length;l++){
                        if((long)nums[i]+nums[j]+nums[k]+nums[l]==target){
                            List<Integer>arr=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                            if(!ans.contains(arr)){
                                ans.add(arr);
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }
}