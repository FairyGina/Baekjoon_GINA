class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int idx=-1;
        int[] answer = new int[queries.length];
        
        for(int[] q:queries){
            idx++;
            int s=q[0],e=q[1],k=q[2];
            int minv=Integer.MAX_VALUE;
            for(int i=s;i<=e;i++){
                if(arr[i]>k) minv=Math.min(minv,arr[i]);
            }
            
            answer[idx]=minv!=Integer.MAX_VALUE?minv:-1;
        }
        
        return answer;
    }
}

/*
s<=idx<=e => find idx
[s,e,k]

find idx>k && min(arr[i])
*/