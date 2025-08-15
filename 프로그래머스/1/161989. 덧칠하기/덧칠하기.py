"""
목표: 롤러로 페인트칠해야할 최소 횟수 출력

입력 변수
n,m //벽 길이, 롤러의 길이
section //페인트를 칠하기로 정한 구역들의 번호 정수 배열

문제 요약
1. 벽에 페인트칠할거임
2. 벽을 1m 구역 n개로 나누고 각 구역에 1~n번까지 번호를 매겨 페인트를 다시 칠할 구역을 정함
3. 롤러로 벽에 페인트를 한 번 칠하는 규칙
    1. 롤러가 벽에서 벗어나면 안됨
    2. 구역의 일부분만 포함되도록 칠하면 안됨
4. 한 구역에 페인트를 여러번 칠해도 됨. 칠하면 안되는 구역에도 해도되지만 그러면 다시 한 번 또 칠해야함

프로그램 구상
1. 벽을 전부 False로 초기화하고 section 값은 True로 처리
2. True를 만날때마다 m만큼 전부 칠함.
3. 범위만 주의하면 될듯

변수 관리

구상 코드

"""

def solution(n, m, section):
    wall=[False]*(n+1)
    for i in section:
        wall[i]=True
    
    ct=0
    for i in range(1,n+1):
        if wall[i]:
            for j in range(m):
                if i+j>n: break
                wall[i+j]=False
            ct+=1
    
    answer = ct
    return answer