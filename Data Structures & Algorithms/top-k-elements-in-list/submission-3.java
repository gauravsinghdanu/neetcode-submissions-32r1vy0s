class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i:nums){
            if(!mp.containsKey(i)){
                mp.put(i,1);
            }else{
                mp.put(i,mp.get(i)+1);
            }
        }
        List<Integer>[]bucket=new ArrayList[nums.length+1];
        for(int n:mp.keySet()){
            int freq=mp.get(n);
            if(bucket[freq]==null){
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(n);
      
        }
        int[] ans=new int[k];
        int idx=0;
        for(int i=bucket.length-1;i>=0&&idx<k;i--){
            if(bucket[i]!=null){
                for(int val:bucket[i]){
                    ans[idx++]=val;
                    if(idx==k) break;
                }
            }
        }
        return ans;
    }
}
