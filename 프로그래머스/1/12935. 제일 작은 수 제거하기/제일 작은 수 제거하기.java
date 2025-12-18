import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int minct=arr[0];
        ArrayList<Integer> mkarr=new ArrayList<>();
        
        for(int i:arr){
            mkarr.add(i);
        }
        
        for(int i=0;i<arr.length;i++){
            minct=Math.min(minct,arr[i]);
        }
        
        int fd=mkarr.indexOf(minct);
        mkarr.remove(fd);
        if(mkarr.isEmpty()) mkarr.add(-1);
        
        return mkarr.stream().mapToInt(Integer::intValue).toArray();
    }
}