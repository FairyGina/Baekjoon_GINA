import java.util.*;

class Solution {
    public long solution(long n) {
        char[] arr=String.valueOf(n).toCharArray();
        Arrays.sort(arr);
        
        String make=new String(arr);
        String mk=new StringBuilder(make).reverse().toString();
        
        long answer=Long.valueOf(mk);
        
        return answer;
    }
}