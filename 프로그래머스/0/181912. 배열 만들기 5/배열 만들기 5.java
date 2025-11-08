import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> as=new ArrayList<>();
        
        for(String str:intStrs){
            int tans=Integer.valueOf(str.substring(s,s+l));
            //System.out.println(tans);
            if(tans>k) as.add(tans);
        }
        //int[] answer = as.stream().mapToInt(i->i).toArray();
        return as;
    }
}