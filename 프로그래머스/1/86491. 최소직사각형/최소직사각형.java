/*
가장 작은 크기의 지갑 출력

sized // w,h // 가로 세로

1. 
*/

class Solution {
    public int solution(int[][] sizes) {
        int maxct=Math.max(sizes[0][0],sizes[0][1]);
        int minct=Math.min(sizes[0][0],sizes[0][1]);
        for(int[] ip:sizes){
            int maxw=Math.max(ip[0],ip[1]);
            int minw=Math.min(ip[0],ip[1]);
            maxct=Math.max(maxct,maxw);
            minct=Math.max(minct,minw);
        }
        
        return maxct*minct;
    }
}