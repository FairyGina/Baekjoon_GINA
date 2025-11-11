class Solution {
    public int solution(int[][] board) {
        int[][] mv={{-1,0}, {-1,-1}, {-1,1}, {0,1}, {0,-1}, {1,-1}, {1,0}, {1,1}};
        
        int ln=board.length;
        for(int i=0;i<ln;i++){
            for(int j=0;j<ln;j++){
                if(board[i][j]==1){
                    for(int[] m:mv){
                        int mx=j+m[0],my=i+m[1];
                        if(0<=my && my<ln && 0<=mx && mx<ln && board[my][mx]==0) board[my][mx]=-1;
                    }
                }
            }
        }
        
        int answer = 0;
        
        for(int[] b:board){
            for(int tb:b) if(tb==0) answer++;
        }
        return answer;
    }
}