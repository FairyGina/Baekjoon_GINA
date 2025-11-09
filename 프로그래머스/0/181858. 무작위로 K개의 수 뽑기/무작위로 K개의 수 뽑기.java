import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> set=new HashSet<>();
        int[] ans=new int[k];
        int idx=0;
        
        for(int i=0;i<arr.length;i++){
            if(set.size()==k) break;
            
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                ans[idx++]=arr[i];
            }
        }
        
        for(int i=set.size();i<k;i++) ans[idx++]=-1;
        return ans;
    }
}