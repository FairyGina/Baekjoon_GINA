class Solution {
    public int solution(int[] num_list) {
        int ln=num_list.length;
        if(ln>10){
            int num=0;
            for(int n:num_list) num+=n;
            return num;
        }else{
            int num=1;
            for(int n:num_list) num*=n;
            return num;
        }
    }
}