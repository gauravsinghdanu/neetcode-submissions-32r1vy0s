class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String ch=tokens[i];

            if(ch.equals("+")){
                int val1=st.pop();
                int val2=st.pop();
                int ans=val2+val1;
                st.push(ans);
            }else if(ch.equals("-")){
                int pos1=st.pop();
                int pos2=st.pop();
                int result=pos2-pos1;
                st.push(result);
            }else if(ch.equals("*")){
                int tok1=st.pop();
                int tok2=st.pop();
                int output=tok2*tok1;
                st.push(output);
            }else if(ch.equals("/")){
                int div1=st.pop();
                int div2=st.pop();
                int divison=div2/div1;
                st.push(divison);
            }else{
                st.push(Integer.parseInt(ch));
            }
        }
        return st.peek();
    }
}
