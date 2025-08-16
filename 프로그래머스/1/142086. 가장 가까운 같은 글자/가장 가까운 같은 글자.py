"""
목표: 연산 수행 출력

입력 변수
s // 입력 문자열

문제 요약
1. s의 각 위치마다 자신보다 앞에 나와있으며, 자신과 가장 가까운 곳에 있는 같은 글자가 어디있는지 확인

프로그램 구상

변수 관리

구상 코드

"""

def solution(s):
    op=[]
    alpha=[-1]*26
    for i in range(len(s)):
        idx=ord(s[i])-97
        if alpha[idx]<0:
            op.append(alpha[idx])
        else:
            op.append(i-alpha[idx])
        alpha[idx]=i
        
    
    answer = []
    return op