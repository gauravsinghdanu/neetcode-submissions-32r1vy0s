class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer>mp=new HashMap<>();
        mp.put(0,1);
        int sum=0,count=0;
        for(int num:nums){
            sum+=num;
            if(mp.containsKey(sum-k)){
                count+=mp.get(sum-k);
            }
            if(!mp.containsKey(sum)){
                mp.put(sum,1);
            }else{
                mp.put(sum,mp.get(sum)+1);
            }
        }
        return count;
    }
}