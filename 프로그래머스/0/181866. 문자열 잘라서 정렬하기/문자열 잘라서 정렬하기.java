import java.util.*;

class Solution {
    public String[] solution(String myString) {
        List<String> as=new ArrayList<>();
        StringTokenizer st=new StringTokenizer(myString,"x");
        while(st.hasMoreTokens()){
            as.add(st.nextToken());
        }
        Collections.sort(as);
        return as.stream().toArray(String[]::new);
    }
}