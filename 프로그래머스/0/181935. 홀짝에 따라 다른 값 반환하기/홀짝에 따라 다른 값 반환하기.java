class Solution {
    public int solution(int n) {
        if (n%2!=0){
            n=n/2+1;
            return n*n;
        }else{
            n/=2;
            return 2*n*(n+1)*(2*n+1)/3;
        }
    }
}
/*
1 2 3 4 5 > 15
1 3 5 > 9
*/