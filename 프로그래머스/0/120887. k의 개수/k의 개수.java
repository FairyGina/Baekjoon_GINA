class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for(int iid=i;iid<=j;iid++){
            int tn=iid;
            while(tn!=0){
                if(tn%10==k) answer++;
                tn/=10;
            }
        }
        
        return answer;
    }
}