class Solution {
    public String minWindow(String s, String t) {
        int[] sMap=new int[256];
        int[] tMap=new int[256];
        for(int i=0;i<t.length();i++){
            tMap[t.charAt(i)]++;
        }
        int left=0,right=0,minLen=Integer.MAX_VALUE,minStart=0;
        for(;right<s.length();right++){
            sMap[s.charAt(right)]++;
            while(contains(sMap,tMap)){
                if(right-left+1<minLen){
                    minLen=right-left+1;
                    minStart=left;
                }
                sMap[s.charAt(left++)]--;
            }
        }
        return minLen==Integer.MAX_VALUE? "" : s.substring(minStart,minStart+minLen);
    }
    private boolean contains(int[]sMap,int[]tMap){
        for(int i=0;i<256;i++){
            if(tMap[i]>sMap[i]){
                return false;
            }
        }
        return true;
    }
}
