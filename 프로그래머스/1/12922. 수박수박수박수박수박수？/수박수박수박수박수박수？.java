class Solution {
    public String solution(int n) {
        char[] arr={'수','박'};
        StringBuilder answer=new StringBuilder();
        
        int idx=0;
        for(int i=0;i<n;i++){
            answer.append(arr[idx]);
            idx=(idx+1)%2;
        }
        
        return answer.toString();
    }
}