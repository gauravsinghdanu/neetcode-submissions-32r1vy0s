class Solution {
    public int majorityElement(int[] nums) {
      Map<Integer,Integer>mp = new HashMap<>();
      for(int s:nums){
        if(!mp.containsKey(s)){
            mp.put(s,1);
        }else{
            mp.put(s,mp.get(s)+1);
        }
        if(mp.get(s)>nums.length/2){
            return s;
        }
      }
      return -1;
    }
}