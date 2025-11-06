class Solution {
    public int solution(int[] num_list) {
        int r1=1,r2=0;
        for(int i=0;i<num_list.length;i++){
            r1*=num_list[i];
            r2+=num_list[i];
        }
        
        r2*=r2;
        return r1<r2?1:0;
    }
}