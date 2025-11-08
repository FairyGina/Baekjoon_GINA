class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] sq=new int[7];
        sq[a]++;
        sq[b]++;
        sq[c]++;
        sq[d]++;
        
        for(int i=1;i<7;i++){
            if(sq[i]==4){
                return 1111*i;
            }else if(sq[i]==3){
                for(int j=1;j<7;j++){
                    if(sq[j]==1) return (10*i+j)*(10*i+j);
                }
            }else if(sq[i]==2){
                for(int j=i+1;j<7;j++){
                    if(sq[j]==2) return (i+j)*Math.abs(i-j);
                }
                int res=1;
                for(int j=1;j<7;j++){
                    if(sq[j]==1) res*=j;
                } return res;
            }
        }
        int res=7;
        for(int j=1;j<7;j++){
            if(sq[j]==1) res=Math.min(res,j);
        } return res;
    }
}