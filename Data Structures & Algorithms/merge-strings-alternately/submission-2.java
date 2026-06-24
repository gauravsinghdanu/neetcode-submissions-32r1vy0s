class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] ans=new char[word1.length()+word2.length()];
        int k=0;
        for(int i=0;i<word1.length()||i<word2.length();i++){
            if(i<word1.length()) ans[k++]=word1.charAt(i);
            if(i<word2.length()) ans[k++]=word2.charAt(i);
        }
        return new String(ans);
    }
}