class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zero=0;
        int product=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }else{
                product*=nums[i];
            }
        }
        int[] arr=new int[nums.length];
        if(zero>1){
            return arr;
        }
        if(zero==1){
            for(int i=0;i<arr.length;i++){
                if(nums[i]==0){
                    arr[i]=product;
                }
            }
            return arr;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=product/nums[i];
        }
        return arr;
    }
}  
