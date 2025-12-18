class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int a1=0,a2=0;
        for(char c:s.toCharArray()){
            char tc=Character.toUpperCase(c);
            if(tc=='P') a1++;
            else if(tc=='Y') a2++;
        }
        
        if(a1!=a2) answer=false;
        return answer;
    }
}