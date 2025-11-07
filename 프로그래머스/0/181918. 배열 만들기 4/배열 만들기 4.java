import java.util.*;
class Solution {
    public Deque<Integer> solution(int[] arr) {
        int ln=arr.length;
        Deque<Integer> stk=new ArrayDeque<>();
        
        for(int i:arr){
            if(stk.isEmpty()){
                stk.offer(i);
            }else{
                while(!stk.isEmpty()){
                    int lst=stk.pollLast();
                    if(lst<i){
                        stk.offer(lst);
                        break;
                    }
                }
                stk.offer(i);
            }
        }
        return stk;
    }
}