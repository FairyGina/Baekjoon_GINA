"""
목표: 상수가 포장하는 햄버거의 개수 출력

입력 변수
ingrediend //상수에게 전해지는 재료의 정보

문제 요약
1. 햄버거에 들어갈 재료를 조리하면, 조리된 순서대로 상수의 앞에 아래서부터 위로 쌓이고, 햄버거를 따로 옮겨 포장
2. 정해진 순서로만 포장
3. 재료의 높이는 무시함
4. 

메모장
이대로면 시초다. O(N)방법을 찾아야함.
1231 문자열을 매번 찾는 방법으로? -> 없애면 다시 n이 들어서 n^2
이거 큐문제다.
1231순 큐'



프로그램 구상
1. 10^6이여서 N으로 해결
2. 빵-야채-고기-빵 이면 return 해야함.
3. 빵-1, 야채-2, 고기-3다. 즉, 1231이여야함. 이 구간을 검색하면 됨.

변수 관리

구상 코드

"""
from collections import deque

def solution(ingredient):
    ham=[1,3,2,1]
    sk=[]
    top,ct=-1,0
    for i in ingredient:
        top+=1
        sk.append(i)
        if len(sk)>3 and sk[-1]==1:
            while len(sk)>3 and sk[-1]==1:
                bl=False
                for j in range(4):
                    if sk[top-j]!=ham[j]:
                        bl=True
                        break
                if bl:
                    break
                for j in range(4):
                    sk.pop()
                    top-=1
                ct+=1
    
    return ct
            