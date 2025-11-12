import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        
        for(int i:nums) hs.add(i);
        //System.out.print(hs.size());
        int n=hs.size(),r=nums.length/2;
        
        return Math.min(n,r);
    }
}