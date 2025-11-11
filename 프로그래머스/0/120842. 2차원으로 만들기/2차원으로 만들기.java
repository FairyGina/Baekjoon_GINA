class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        
        int idx=0;
        for(int i:num_list){
            answer[idx/n][idx%n]=i;
            idx++;
        }
        return answer;
    }
}