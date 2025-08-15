"""
목표: 바탕화면의 파일들을 한 번에 삭제하기 위해 최소한의 이동거리를 갖는 드래그의 시작점과 끝점(lux,luy, rdx,rdy) 출력

입력 변수
wallpaper // 컴퓨터 바탕화면 상태 문자열 배열


문제 요약
1. 바탕화면의 모든 파일을 최소한의 사각형으로 삭제하려고 함
2. S(lux,luy) -> E(rdx,rdy)

주의할 점

메모장

프로그램 구상
1. miny,minx,maxy,maxx



변수 관리

구상 코드
height,weight=len(wallpaper),len(wallpaper[0])
miny,minx,maxy,maxx=height,weight,-1,-1

for i in range(height):
    for j in range(weight):
        if wallpaper[i][j]=='#':
            if i<miny: miny=i
            if i>maxy: maxy=i
            if j<minx: minx=j
            if j>maxx: maxx=j
 
op=[]
op.append(minx)
op.append(miny)
op.append(maxx)
op.append(maxy)
"""

def solution(wallpaper):
    height,weight=len(wallpaper),len(wallpaper[0])
    miny,minx,maxy,maxx=height,weight,-1,-1

    for i in range(height):
        for j in range(weight):
            if wallpaper[i][j]=='#':
                if i<miny: miny=i
                if i>maxy: maxy=i
                if j<minx: minx=j
                if j>maxx: maxx=j

    op=[]
    op.append(miny)
    op.append(minx)
    op.append(maxy+1)
    op.append(maxx+1)
    
    
    answer = op
    return answer