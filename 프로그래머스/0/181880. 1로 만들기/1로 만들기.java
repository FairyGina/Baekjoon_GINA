class Solution {
    public int solution(int[] num_list) {
        int ct=0;
        for(int n:num_list){
            while(n!=1){
                ct++;
                n/=2;
            }
        }
        return ct;
    }
}