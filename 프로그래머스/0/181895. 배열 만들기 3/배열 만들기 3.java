class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int a1=intervals[0][0],b1=intervals[0][1];
        int a2=intervals[1][0],b2=intervals[1][1];
        
        int[] as=new int[b1-a1+b2-a2+2];
        for(int i=0,j=a1;j<=b1;i++,j++) as[i]=arr[j];
        for(int i=b1-a1+1,j=a2;j<=b2;i++,j++) as[i]=arr[j];        
        
        return as;
    }
}