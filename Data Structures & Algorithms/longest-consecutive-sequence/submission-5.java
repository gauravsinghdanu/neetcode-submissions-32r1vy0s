class Solution {
    public int longestConsecutive(int[] nums) {
        int longest=0;
        Map<Integer,Boolean>mp=new HashMap<>();
        for(int num:nums){
            mp.put(num,Boolean.FALSE);
        }

        for(int num:nums){
            int current=1;
            int nextNum=num+1;
            while(mp.containsKey(nextNum) && mp.get(nextNum)==false){
                current++;
                mp.put(nextNum,Boolean.TRUE);

                nextNum++;
            }

            int prevNum=num-1;
            while(mp.containsKey(prevNum) && mp.get(prevNum)==false){
                current++;
                mp.put(prevNum,Boolean.TRUE);

                prevNum--;
            }

            longest = Math.max(longest,current);
        }
        return longest;
    }
}
