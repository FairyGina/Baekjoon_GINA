class Solution {
    public int solution(int angle) {
        int answer = 1;
        if(90==angle){
             answer=2;
        }else if(90<angle){
            if(angle<180) answer=3;
            else answer=4;
        }
        
        return answer;
    }
}