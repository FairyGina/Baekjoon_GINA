class Solution {
    public int solution(int[][] arr) {        
        int answer = 1;
        int ln1=arr.length,ln2=arr[0].length;
        for(int i=0;i<ln1;i++){
            for(int j=0;j<ln2;j++){
                if(arr[i][j]!=arr[j][i]) answer=0;
            }
        }
        
        return answer;
    }
}