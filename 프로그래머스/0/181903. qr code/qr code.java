class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder as=new StringBuilder();
        for(int i=r;i<code.length();i+=q) as.append(code.charAt(i));
        return as.toString();
    }
}