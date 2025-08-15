"""
목표: 로봇 강아지가 모든 명령 수행 후 놓인 위치를 [h-1,w-1] 출력

입력 변수
park // 공원 문자열 배열
routes //로봇 강아지가 수행할 명령이 담긴 문자열 배열

문제 요약
1. 지나다니는 길은 O, 못가는 길은 X로 표시된 직사각형 공원
2. 사방향 / 이동 칸 개수
3. 이동 전, 유효한 좌표인지/장애물이 있는지 확인

주의할 점

메모장

프로그램 구상

변수 관리

구상 코드
my=(-1,1,0,0)
mx=(0,0,-1,0)
wasd={"S":0, "N":1 "W":2 "E":3}
height,weight=len(park),len(park[0])

y,x=0,0
for i in range(height):
    for j in range(weight):
        if park[i][j]=='S':
            y=i
            x=j
            break

for et in routes:
    ban,can=et.strip().split()
    ty=y+my[wasd[ban]]*can
    tx=x+mx[wasd[ban]]*can
    if 0<=ty<height and 0<=tx<weight and park[ty][tx]!='X':
        y=ty
        x=tx

op=[]
op.append(y)
op.append(x)

answer=op
"""

def solution(park, routes):
    my=(-1,1,0,0)
    mx=(0,0,-1,1)
    wasd={"N":0, "S":1, "W":2, "E":3}
    height,weight=len(park),len(park[0])

    y,x=0,0
    for i in range(height):
        for j in range(weight):
            if park[i][j]=='S':
                y=i
                x=j
                break

    print(y,x)
    for et in routes:
        ban,can=et.strip().split()
        can=int(can)
        ty=y+my[wasd[ban]]*can
        tx=x+mx[wasd[ban]]*can
        
        if 0<=ty<height and 0<=tx<weight and park[ty][tx]!='X':
            cg=True
            yy,xx=y,x
            for i in range(can):
                yy+=my[wasd[ban]]
                xx+=mx[wasd[ban]]
                if park[yy][xx]=='X':
                    cg=False
                    break
            if cg:
                y=ty
                x=tx
            print(y,x)

        

    op=[]
    op.append(y)
    op.append(x)

    answer=op
    return answer