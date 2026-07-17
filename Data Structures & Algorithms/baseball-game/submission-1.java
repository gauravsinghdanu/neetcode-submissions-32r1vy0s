class Solution {
    public int calPoints(String[] operations) {
        int result=0;
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            String num=operations[i];
            if(num.equals("+")){
                int val1=st.pop();
                int val2=st.pop();
                int sum=val1+val2;
                st.push(val2);
                st.push(val1);
                st.push(sum);
            }else if(num.equals("D")){
                st.push(2*st.peek());
            }else if(num.equals("C")){
                st.pop();
            }else{
                st.push(Integer.parseInt(num));
            }
        }
        while(st.size()>0){
            result+=st.pop();
        }
        return result;
    }
}