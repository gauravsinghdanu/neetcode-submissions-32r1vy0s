class Solution {
    public int lengthOfLongestSubstring(String s) {
       int n=s.length();
       int maxi=0;
       for(int i=0;i<n;i++){
        HashSet<Character>st=new HashSet<>();
        for(int j=i;j<n;j++){
            char ch=s.charAt(j);
            if(st.contains(ch)){
                break;
            }
            st.add(ch);
            maxi=Math.max(maxi,j-i+1);
        }
       }
       return maxi; 
    }
}
