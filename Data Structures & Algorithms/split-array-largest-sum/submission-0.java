class Solution {
    public int splitArray(int[] nums, int k) {
        int low=0;
        int high=0;
        for(int num:nums){
            low=Math.max(num,low);
            high+=num;
        }
        while(low<high){
            int mid=low+(high-low)/2;
            if (canSplit(nums,k,mid)){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
        
    }
    private boolean canSplit(int[] nums,int k,int mid){
        int subarray=1;
        int sum=0;
        for(int num:nums){
            if(sum+num<=mid){
                sum+=num;
            }else{
                subarray++;
                sum=num;
            }
        }
        return subarray<=k;
    }
}