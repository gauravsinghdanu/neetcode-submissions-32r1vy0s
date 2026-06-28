class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer>arr = Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(arr);

                        if(!ans.contains(arr)){
                            ans.add(arr);
                        }
                    }
                }
            }
        }
        return ans;
    }
}
