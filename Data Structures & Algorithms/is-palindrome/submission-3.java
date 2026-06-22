class Solution {
    public boolean isPalindrome(String s) {
       s=s.toLowerCase();
       String str="";
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);

        if(Character.isLetterOrDigit(ch)){
            str+=ch;
        }
       }
       String ans="";
       for(int i=str.length()-1;i>=0;i--){
        ans+=str.charAt(i);
       }
       if(str.equals(ans)){
        return true;
       }
       return false;
    }
}
