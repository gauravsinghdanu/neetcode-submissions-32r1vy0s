class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums==null && nums.length<4) return new ArrayList<>();
        Set<List<Integer>>ans=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int left=j+1;
                int right=nums.length-1;
                while(left<right){
                    long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                    }else if(sum<target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }
}