class Solution {
    public String solution(String s, int n) {
        StringBuilder answer=new StringBuilder();
        
        for(char c:s.toCharArray()){
            if(c==' '){
                answer.append(c);
                continue;
            }
            char mc='A';
            if('a'<=c && c<='z') mc='a';
            char tc=(char)((c-mc+n)%26+mc);
            answer.append(tc);
        }
        
        return answer.toString();
    }
}