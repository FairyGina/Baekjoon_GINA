class Solution {
    public int solution(int a, int b) {
        String sa=String.valueOf(a),sb=String.valueOf(b);
        
        int res1=Integer.valueOf(sa+sb),res2=2*a*b;
        
        int answer = res1;
        if(answer<res2) answer=res2;
        return answer;
    }
}