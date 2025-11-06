class Solution {
    public int solution(int a, int b, int c) {
        int[] nb=new int[7];
        nb[a]++;
        nb[b]++;
        nb[c]++;
        
        int r1=a+b+c, r2=a*a+b*b+c*c, r3=a*a*a+b*b*b+c*c*c;
        
        for(int i=1;i<7;i++){
            if(nb[i]==3){
                return r1*r2*r3;
            }else if(nb[i]==2){
                return r1*r2;
            }
        }
        // 216*3=600
        return r1;
    }
}