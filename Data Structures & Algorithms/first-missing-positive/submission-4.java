class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer>st=new HashSet<>();
        for(int num:nums){
            if(num>0){
                st.add(num);
            }
        }
        int ans=1;
        while(st.contains(ans)){
            ans++;
        }
        return ans;
    }
}