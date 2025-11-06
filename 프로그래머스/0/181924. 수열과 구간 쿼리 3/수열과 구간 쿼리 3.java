class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] q:queries){
            int x=q[0],y=q[1];
            int tp=arr[x];
            arr[x]=arr[y];
            arr[y]=tp;
        }
        
        return arr;
    }
}