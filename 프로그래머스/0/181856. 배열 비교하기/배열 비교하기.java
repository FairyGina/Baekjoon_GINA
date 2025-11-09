class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        int ln1=arr1.length,ln2=arr2.length;
        if(ln1>ln2) answer=1;
        else if(ln1<ln2) answer=-1;
        else{
            int sum1=0,sum2=0;
            for(int i:arr1) sum1+=i;
            for(int i:arr2) sum2+=i;
            if(sum1>sum2) answer=1;
            else if(sum1<sum2) answer=-1;
        }
        return answer;
    }
}