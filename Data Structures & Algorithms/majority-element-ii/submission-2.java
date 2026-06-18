class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer>mp = new HashMap<>();
        for(int num:nums){
            if(!mp.containsKey(num)){
                mp.put(num,1);
            }else{
                mp.put(num,mp.get(num)+1);
            }
        }
        List<Integer>ans = new ArrayList<>();
        for(int key:mp.keySet()){
            if(mp.get(key)>nums.length/3){
                ans.add(key);
            }
        }
        return ans;
    }
}