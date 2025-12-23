import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int ln=people.length;
        int lf=0,rt=ln-1;
        int answer=ln;
        Arrays.sort(people);
        
        while(lf<rt){
            int tn=people[lf]+people[rt];
            if(tn<=limit){
                answer--;
                lf++; rt--;
            }else if(tn>limit) rt--;
        }
        
        return answer;
    }
}