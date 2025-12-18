class Solution {
    public boolean solution(String s) {
        int ln=s.length();
        
        if(ln!=4 && ln!=6) return false;
        for(char c:s.toCharArray()){
            if('0'>c || '9'<c) return false;
        }
        
        return true;
    }
}