# """
# 목표: 이웃 칸 중 몇 개의 칸이 같은 색으로 색칠되어 있는지 확이나는 과정

# 입력 변수
# board // 보드의 각 칸에 칠해진 색깔 이름 2차원 문자열 리스트
# h,w //고른 칸의 위치 row, col

# 문제 요약
# 1. 

# 주의할 점

# 메모장

# 프로그램 구상

# 변수 관리

# 구상 코드


# """



def solution(board, h, w):
    my=(-1,1,0,0)
    mx=(0,0,-1,1)
    
    count=0
    ylen,xlen=len(board),len(board[0])
    for i in range(4):
        ty=h+my[i]
        tx=w+mx[i]
        if 0<=ty<ylen and 0<=tx<xlen and board[h][w]==board[ty][tx]:
            count+=1
    answer=count
    return answer