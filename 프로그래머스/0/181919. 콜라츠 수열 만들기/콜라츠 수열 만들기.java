import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> as=new ArrayList<>();

        while(n!=1){
            as.add(n);
            if(n%2==0) n/=2;
            else n=3*n+1;
        }
        as.add(1);
        
        int[] answer = as.stream().mapToInt(i->i).toArray();
        return answer;
    }
}