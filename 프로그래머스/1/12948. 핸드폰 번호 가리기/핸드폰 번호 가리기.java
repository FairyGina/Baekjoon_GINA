import java.util.*;

class Solution {
    public String solution(String phone_number) {
        StringBuilder sb=new StringBuilder(phone_number),answer=new StringBuilder();
        sb.reverse();
        
        for(int i=0;i<4;i++){
            answer.append(sb.charAt(i));
        }
        
        for(int i=0;i<sb.length()-4;i++) answer.append('*');
        //System.out.print(sb.toString());
        
        return answer.reverse().toString();
    }
}