import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String,Integer> hm=new HashMap<>();
        
        for(String[] sarr:clothes){
            if(!hm.containsKey(sarr[1])) hm.put(sarr[1],1);
            else{
                int tn=hm.get(sarr[1]);
                hm.replace(sarr[1],tn+1);
            }
        }
        
        int answer = 1;
        for(int value:hm.values()){
            answer*=(value+1);
        }
        
        return answer-1;
    }
}