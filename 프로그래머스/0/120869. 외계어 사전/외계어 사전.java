import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Set<Character> set1=new HashSet<>(),set2=new HashSet<>();
        for(String c:spell) set1.add(c.charAt(0));
        
        for(String s:dic){
            set2.clear();
            for(char c:s.toCharArray()){
                set2.add(c);
            }
            if(set1.equals(set2)) return 1;
        }
        
        
        return 2;
    }
}