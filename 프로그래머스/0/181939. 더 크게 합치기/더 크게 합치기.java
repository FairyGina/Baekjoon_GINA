class Solution {
    public int solution(int a, int b) {
        String a1=String.valueOf(a);
        String b1=String.valueOf(b);
        
        String s1=a1+b1, s2=b1+a1;
        a=Integer.valueOf(s1);
        b=Integer.valueOf(s2);
                
        int answer = a;
        if(answer<b) answer=b;
        return answer;
    }
}