"""
목표: 과일 장수가 얻을 수 있는 최대 이익 출력

입력 변수
k //사과의 최대 점수
m //한 상자에 들어가는 사과의 수
score //사과들의 점수
p // 한 상자중 가장 낮은 사과 점수

문제 요약
1. 사과는 상태에 따라 1~k점까지 분류 k갈수록 높음
2. 한 상자에 사과를 m개씩 담아 포장
3. 상자에 담긴 사과 중 가장 낮은 점수가 p인 경우 한상자 가격은 p*m

프로그램 구상

변수 관리

구상 코드


"""


def solution(k, m, score):
    num=0
    idx=m-1
    score.sort(reverse=True)
    for i in range(len(score)//m):
        num+=score[i*m+idx]*m
    answer = 0
    return num