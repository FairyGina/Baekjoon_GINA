"""
목표: card1, card2에 적힌 단어들로 goal를 만들 수 있으면 Yes/No를 출력

입력 변수
cards1,cards2 //문자열 배열
goal //원하는 단어 문자열 배열

문제 요약
1. 영단어가 적힌 카드 뭉치 2개를 받음
2. 규칙에 따라 원하는 순서의 단어 배열을 만들어야함
    1. 카드를 순서대로 한 장씩 사용
    2. 한 번 사용한 카드 재사용 불가
    3. 카드를 사용하지 않고 다음 카드로 넘어갈 수 없음
    4. 기존에 주어진 카드 뭉치의 단어 순서는 바꿀 수 없음
3. 

프로그램 구상

변수 관리

구상 코드

"""

def solution(cards1, cards2, goal):
    idx1,idx2=0,0
    clen1,clen2=len(cards1),len(cards2)
    
    for g in goal:
        check=True
        if idx1<clen1 and cards1[idx1]==g:
            idx1+=1
            check=False
        if check:
            if idx2<clen2 and cards2[idx2]==g:
                idx2+=1
                check=False
        if check: return "No"
    return "Yes"