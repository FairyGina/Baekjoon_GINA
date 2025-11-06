import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int slen=num_list.length;
        int a=num_list[slen-1],b=num_list[slen-2];
        
        int[] answer=new int[slen+1];
        for(int i=0;i<slen;i++){
            answer[i]=num_list[i];
        }
        
        if (a>b) answer[slen]=a-b;
        else answer[slen]=2*a;
        
        return answer;
    }
}