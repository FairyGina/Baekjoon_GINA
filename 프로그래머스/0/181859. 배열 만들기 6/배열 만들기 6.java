import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> dq=new ArrayDeque<>();
        
        for(int i=0;i<arr.length;i++){
            if(dq.isEmpty()) dq.offer(arr[i]);
            else if(dq.peekLast()==arr[i]) dq.pollLast();
            else dq.offer(arr[i]);
        }
        
        if(dq.isEmpty()) dq.offer(-1);
        return dq.stream().mapToInt(i->i).toArray();
    }
}