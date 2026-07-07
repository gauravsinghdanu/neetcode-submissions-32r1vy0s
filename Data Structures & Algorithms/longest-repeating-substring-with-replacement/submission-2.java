class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int i=0;
        int maxWindow=0;
        int maxFreq=0;
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            freq[ch-'A']++;

            maxFreq=Math.max(maxFreq,freq[ch-'A']);
            int windowSize=j-i+1;

            if(windowSize-maxFreq>k){
                freq[s.charAt(i)-'A']--;
                i++;
            }
            
            windowSize=j-i+1;
            maxWindow=Math.max(maxWindow,windowSize);
        }
        return maxWindow;
    }
}
