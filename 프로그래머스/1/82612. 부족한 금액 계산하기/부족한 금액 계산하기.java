/*
현재 자신의 금액에서 모자라는 금액 출력/남으면 0



price // 이용료
money // 내 돈
count // 놀이기구 이용 횟수
*/

class Solution {
    public long solution(int price, int money, int count) {
        long m=money, p=price;
        for(int i=0;i<count;i++){
            m-=p;
            p+=price;
        }
        if(m>0) m=0;
        else m=Math.abs(m);

        return m;
    }
}