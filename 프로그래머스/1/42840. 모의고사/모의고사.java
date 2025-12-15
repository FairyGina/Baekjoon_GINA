import java.math.*;
import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[][] arr={
            {1,2,3,4,5},
            {2,1,2,3,2,4,2,5},
            {3,3,1,1,2,2,4,4,5,5}
        };

        int id1=-1,id2=-1,id3=-1;
        int ln1=5,ln2=8,ln3=10;
        int a1=0,a2=0,a3=0;
        
        for(int a:answers){
            id1=(id1+1)%ln1;
            id2=(id2+1)%ln2;
            id3=(id3+1)%ln3;
            if(a==arr[0][id1]) a1+=1;
            if(a==arr[1][id2]) a2+=1;
            if(a==arr[2][id3]) a3+=1;
        }
        
        ArrayList<Integer> answer=new ArrayList<>();
        
        int maxct=Math.max(a3,Math.max(a1,a2));
        //System.out.println(maxct);
        
        if(maxct==a1) answer.add(1);
        if(maxct==a2) answer.add(2);
        if(maxct==a3) answer.add(3);
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}