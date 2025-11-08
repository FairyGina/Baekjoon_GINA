import java.util.*;

class Solution {
    public StringBuilder solution(String my_string, int[] index_list) {
        StringBuilder as=new StringBuilder();
        for(int i:index_list){
            as.append(my_string.charAt(i));
        }
        
        return as;
    }
}