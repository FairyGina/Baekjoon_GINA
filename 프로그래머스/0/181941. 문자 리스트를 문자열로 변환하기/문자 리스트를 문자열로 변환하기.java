import java.util.*;
class Solution {
    public String solution(String[] arr) {
        StringBuilder as=new StringBuilder();
        for(int i=0;i<arr.length;i++) as.append(arr[i]);
        return as.toString();
    }
}