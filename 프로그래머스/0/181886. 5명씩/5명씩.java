class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[names.length/5+(names.length%5==0?0:1)];
        
        for(int i=0,j=0;i<names.length;i+=5,j++){
            answer[j]=names[i];
        }
        return answer;
    }
}