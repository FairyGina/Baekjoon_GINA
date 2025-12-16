class Solution {
    public int solution(String s) {
        if(s.charAt(0)!='-'){
            return Integer.parseInt(s);
        }else{
            String ts=s.substring(1,s.length());
            return -1*Integer.parseInt(ts);
        }
        
    }
}