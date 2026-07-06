class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>st=new HashSet<>();
        int maxi=0;
        int i=0;
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            while(st.contains(ch)){
                st.remove(s.charAt(i));
                i++;
            }
            st.add(ch);
            maxi=Math.max(maxi,j-i+1);
        }
        return maxi;
    }
}
