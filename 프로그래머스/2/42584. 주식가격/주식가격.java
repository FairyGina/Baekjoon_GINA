import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int ln=prices.length;
        int[] answer = new int[ln];

        int[] idxarr = new int[ln];
        for(int i=0;i<ln;i++) idxarr[i]=i;
        
        int time=0;
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i:idxarr){
            time++;
            if(dq.isEmpty()){
                dq.offerLast(i);
                continue;
            }
            while(!dq.isEmpty()){
                if(prices[dq.peekLast()]>prices[i]){
                    int idx=dq.pollLast();
                    answer[idx]=time-idx-1;
                }else break;
            }
            dq.offerLast(i);
        }

        while(!dq.isEmpty()){
            int idx=dq.pollLast();
            answer[idx]=ln-idx-1;
        }
        return answer;
    }
}