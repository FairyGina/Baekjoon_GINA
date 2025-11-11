class Solution {
    public int solution(String before, String after) {
        int[] nb1=new int[26],nb2=new int[26];
        for(char c:before.toCharArray()){
            nb1[c-'a']++;
        }
        for(char c:after.toCharArray()){
            nb2[c-'a']++;
        }
        
        for(int i=0;i<26;i++) if(nb1[i]!=nb2[i]) return 0;
        
        return 1;
    }
}