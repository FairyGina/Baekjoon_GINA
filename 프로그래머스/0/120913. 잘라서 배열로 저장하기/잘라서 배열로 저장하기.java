import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[my_str.length()/n+(my_str.length()%n==0?0:1)];
        
        int i=0;
        for(int j=0;j<answer.length;i+=n,j++){
            answer[j]=my_str.substring(i,Math.min(i+n,my_str.length()));
        }
        return answer;
    }
}