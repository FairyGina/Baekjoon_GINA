import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] arr=new String[picture.length*k];
        
        int idx=0;
        for(int i=0;i<picture.length;i++){
            StringBuilder mk=new StringBuilder();
            for(char c:picture[i].toCharArray()){
                for(int j=0;j<k;j++) mk.append(c);
            }
            for(int j=0;j<k;j++) arr[idx++]=mk.toString();
        }
        
        return arr;
    }
}