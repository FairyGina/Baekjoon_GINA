import java.util.*;

class Solution {
    public StringBuilder solution(String[] my_strings, int[][] parts) {
        int idx=0;
        StringBuilder as=new StringBuilder();
        for(String str:my_strings){
            int[] q=parts[idx++];
            String ts=str.substring(q[0],q[1]+1);
            //System.out.println(ts);
            for(char c:ts.toCharArray()){
                as.append(c);
            }
            
        }
        
        //String answer = as.toString();
        return as;
    }
}