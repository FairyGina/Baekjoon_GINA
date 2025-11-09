class Solution {
    public int solution(String num_str) {
        int num=0;
        for(char c:num_str.toCharArray()) num+=c-'0';
        
        return num;
    }
}