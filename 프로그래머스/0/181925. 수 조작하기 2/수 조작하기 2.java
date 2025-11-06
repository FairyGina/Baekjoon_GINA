import java.util.*;

class Solution {
    public String solution(int[] numLog) {
        StringBuilder as=new StringBuilder();
        
        for(int i=1;i<numLog.length;i++){
            int cur=numLog[i]-numLog[i-1];
            if(cur==1) as.append('w');
            else if(cur==-1) as.append('s');
            else if(cur==10) as.append('d');
            else as.append('a');
        }
        
        return as.toString();
    }
}