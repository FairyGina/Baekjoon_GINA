class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(char c:my_string.toCharArray()){
            if(c>='a'){
                answer[c-71]++;
            }else answer[c-'A']++;
        }
        return answer;
    }
}