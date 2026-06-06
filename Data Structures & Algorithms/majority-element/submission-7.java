class Solution {
    public int majorityElement(int[] nums) {
      Map<Integer,Integer>mp = new HashMap<>();
      for(int s:nums){
        if(!mp.containsKey(s)){
            mp.put(s,1);
        }else{
            mp.put(s,mp.get(s)+1);
        }
      }
      int max = 0;
      int ans = 0;
      for(int key:mp.keySet()){
        if(mp.get(key)>max){
            max = mp.get(key);
            ans = key;
        }
      }
      return ans;
    }
}