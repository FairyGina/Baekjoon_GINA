class Solution {
    public int solution(int[] common) {
        boolean bl=true;
        if ((common[1]-common[0]) == common[2]-common[1]) bl=false;
        
        int answer = common[common.length-1]+common[1]-common[0];
        if(bl) answer=common[common.length-1]*(common[1]/common[0]);
        
        return answer;
    }
}