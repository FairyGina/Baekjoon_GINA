import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        StringBuilder s1=new StringBuilder(),s2=new StringBuilder();
        
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2!=0) s1.append(num_list[i]);
            else s2.append(num_list[i]);
        }
        
        int a1=Integer.valueOf(s1.toString()), a2=Integer.valueOf(s2.toString());
        return a1+a2;
    }
}