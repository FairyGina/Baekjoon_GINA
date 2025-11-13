import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Deque<Integer> truck=new ArrayDeque<>(), dari=new ArrayDeque<>();
        for(int i:truck_weights) truck.offerLast(i);
        for(int i=0;i<bridge_length;i++) dari.offerLast(0);
        
        int time=0,kg=0;
        while(!truck.isEmpty()){
            time++;
            kg-=dari.pollFirst();
            
            if(kg+truck.peekFirst()<=weight){
                int addn=truck.pollFirst();
                dari.offerLast(addn);
                kg+=addn;
            } else dari.offerLast(0);
        }
        
        int[] mk=new int[dari.size()];
        int maxid=0;
        while(!dari.isEmpty()) mk[maxid++]=dari.pollFirst();
        
        maxid=0;
        for(int i=0;i<mk.length;i++){
            if(0<mk[i]) maxid=i;
        }
        
        return time+maxid+1;
    }
}