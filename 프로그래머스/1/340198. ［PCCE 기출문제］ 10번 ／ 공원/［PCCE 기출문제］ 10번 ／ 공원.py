"""
목표: 지민이가 깔 수 있는 가장 큰 돗자리 길이를 출력

입력 변수
mats //지민이가 가진 돗자리의 한 변의 길이 정수 배열
park //현재 공원의 자리 배치도 2차원 문자열 배열

문제 요약
1. 지민이는 다양한 크기의 정사각형 모양 돗자리가 있음
2. 공원에서 가장 큰 직사각형을 확인해야함

주의할 점
1. 돗자리 못 깔면 -1을 출력해야함
2.


프로그램 구상
1. -1이 빈공간이므로 지민이가 갖고 있는 돗자리 중 가장 긴 값부터 시작해서 해당 사각형 배열이 전부 -1인지 브루트포스하는 코드가 필요함
1-1. 정사각형 하나만 탐색하는 코드 필요
1-2. 정사각형에서 시작하는 그 좌표를 반복하는 코드 필요
1-3. 이를 mats의 개수만큼 돌리는 코드 필요
2. 길이가 무조건 내림차순인 보장이 없으므로 일단 mats를 내림차순으로 정렬해야함


메모장
1. 어디도 깔 수 없는 돗자리를 출력해보자.


관리 변수
parkw, parkh //공원 가로, 세로 길이




구상 코드
F1-1(row,col) #정사각형 하나만 보는 코드
for i in range(row,row+length): 
    for j in range(col,col+length):
        if park[i][j]!="-1":
            return False
return True

F1-2(length) # 탐색할 좌표를 주는 코드
length를 주면,
가로는 0부터 parkw-length까지,
세로는 0부터 parkh-length 봐야함

wend,hend=parkw-length,parkh-length
for r in range(hend):
    for c in range(wend):
        if F1-1(r,c):
            return True
return False


parkh,parkw=len(park),len(park[0])
mats.sort(reverse=True)

answer=-1
for length in range(len(mats)):
    if F1-2:
        answer=length
        break

return answer







"""
parkh,parkw=0,0
parks=[]

def f1(row,col,length): # 정사각형 하나만 보는 코드
    global parks
    for i in range(row,row+length): 
        for j in range(col,col+length):
            if parks[i][j]!='-1':
                return False
    return True

def f2(length): # 탐색할 좌표를 주는 코드
    global parkh,parkw
    wend,hend=parkw-length,parkh-length
    for r in range(hend+1):
        for c in range(wend+1):
            if f1(r,c,length):
                return True
    return False


def solution(mats,park):
    global parkh,parkw,parks
    
    parks=park
    #print(parks)
    parkh,parkw=len(park),len(park[0])
    mats.sort(reverse=True)
    #print(parkh,parkw)

    answer=-1
    for length in range(len(mats)):
        if f2(mats[length]):
            answer=mats[length]
            break

    return answer