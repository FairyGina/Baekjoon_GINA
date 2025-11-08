class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean r1=x1||x2,r2=x3||x4;
        boolean answer = r1&&r2;
        return answer;
    }
}