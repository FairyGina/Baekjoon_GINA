class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] le=new int[201];
        
        for(int[] arr:lines){
            for(int i=arr[0]+100;i<arr[1]+100;i++){
                le[i]++;
            }
        }
        
        for(int i=0;i<201;i++) if(le[i]>1) answer++;
        
        return answer;
    }
}