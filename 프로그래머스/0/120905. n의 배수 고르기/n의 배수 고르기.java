import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> arr=new ArrayList<>();
        for(int nb:numlist){
            if(nb%n==0) arr.add(nb);
        }
        
        int[] answer = arr.stream().mapToInt(i->i).toArray();
        return answer;
    }
}