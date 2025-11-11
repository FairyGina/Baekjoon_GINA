class Solution {
    public int solution(String my_string) {
        char[] arr=my_string.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(('a'<=arr[i] && arr[i]<='z') || ('A'<=arr[i] && arr[i]<='Z')) arr[i]=' ';
        }
        int answer = 0;
        String[] sarr=new String(arr).trim().split("\\s+");
        
        for(String sa:sarr) if (!sa.isEmpty()) answer+=Integer.parseInt(sa);
        return answer;
    }
}