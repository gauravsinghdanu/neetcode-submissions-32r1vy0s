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
       int[] ans= new int[k];
       for(int i=0;i<k;i++){
        int num=0;
        int high=0;

            for(int n:mp.keySet()){
               int freq=mp.get(n);
               if(freq>high){
                high=freq;
                num=n;
               }
            }
            ans[i]=num;
            mp.remove(num);
       }
       return ans;
    }
}
