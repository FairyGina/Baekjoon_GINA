import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> arr=new ArrayList<>(Arrays.asList(my_string.split(" ")));
        arr.removeIf(s->s.isEmpty());
        
        return arr.stream().toArray(String[]::new);
    }
}