class Solution {
    public int solution(int num) {
        long n=Long.valueOf(num);
        
        int ct=0;
        
        while(n!=1 && ct++<500){
            if(n%2==0) n/=2;
            else if(n%2!=0) n=n*3+1;
        }
        
        if(ct>500) ct=-1;
        return ct;
    }
}