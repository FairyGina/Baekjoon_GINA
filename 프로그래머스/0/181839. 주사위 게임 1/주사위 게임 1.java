class Solution {
    public int solution(int a, int b) {
        int res=0;
        if(a%2==0){
            if(b%2==0) res=Math.abs(a-b);
            else res=2*(a+b);
        }else{
            if(b%2!=0) res=a*a+b*b;
            else res=2*(a+b);
        }
        
        return res;
    }
}