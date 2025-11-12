class Solution {
    public int solution(int n) {
        int idx=6;
        while(idx%n!=0){
            idx+=6;
        }
        return idx/6;
    }
}