class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        int s1len=s1.length();
        int s2len=s2.length();

        if(s1len>s2len) return false;

        int l=0;
        int r=0;
        while(r<s1len){
            freq1[s1.charAt(r)-'a']++;
            freq2[s2.charAt(r)-'a']++;
            r++;
        }
        r--;

        while(r<s2len){
            if(Arrays.equals(freq1,freq2)) return true;
            r++;
            if(r!=s2len){
                freq2[s2.charAt(r)-'a']++;
            }
            freq2[s2.charAt(l)-'a']--;
            l++;
        }
        return false;
    }
}
