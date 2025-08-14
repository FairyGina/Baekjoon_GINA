# """
# 목표: 모든 공격이 끝난 후 남은 체력 출력, 0 이하면 -1을 출력

# 입력 변수
# bandage // 기술 시전 시간(t) / 1초당 회복량(x) / 추가 회복량(y) 3개 있는 1차원 배열
# health // 최대 체력
# attacks // 몬스터 공격 시간 / 피해량 2차원 배열. 길이는 공격 횟수

# 문제 요약
# 1. t초동안 붕대를 감고, 1초마다 x만큼 체력 회복. t초 연속 감는게 성공 시 y만큼 체력을 추가로 얻음.
#     * 현제 체력이 최대 체력보다 커지는 것은 불가능
# 2. 기술 시전 중 몬스터에게 공격 당하면 기술이 취소되고, 당하는 순간은 체력 회복 불가능. 기술 취소시 바로 붕대감기가 재시전. => 연속 성공 시간이 0으로 초기화
# 3. 몬스터의 공격을 받으면 피해량(attacks[1]) 만큼 체력이 줄어들며, 0 이하가 되면 체력 회복 불가.

# 주의할 점
# 체력 최대치, 0을 잘 생각해야함. 다만 0은 바로 -1 리턴해야함. 0 "이하"임
# 시작하자마자 스킬을 쓰는가, 아니면 처음 공격당할때 쓰는건가 모호함

# 메모장
# 공격 시전이 2초에 시작하고, 회복은 5초동안 걸린다, 즉 다음 공격 시전 시간 전에만 다 돌리면 추가 체력까지 얻지만, 그전에 공격해버리면 추가체력은 커녕 차이나는 시간만큼만 체력이 회복됨. 그렇다면 다음 공격 시간을 무조건 알아야한다는 소리임. 나중에는 모든 공격이 끝난 직후 남은 체력이므로, n-1까지 받아야함.
# 현재 시간이 2초고 다음 공격 시간이 9초면, nexttime은 9-2 -> 7초 뒤에 시전.
# 즉 curtime // 현재 시간 nexttime=attacks[i+1]-curtime으로 알 수 있음. nexttime은 다음 공격 시전까지 남은 시간을 말함.
# nexttime<t 면 시간안에 회복을 다 못함. 따라서 nexttime만큼 x를 곱해서 체력을 더해야함.
# 만약 아니면 체력 회복이 가능하므로 curhel=min(curhel+fullpack,health) // 풀 체력을 넘으면 안됨
# 8-5



# fullpack = 10
# t,x,y=5,1,5

# 30
# 2 -> 20
# 7분 -> 30

# 15 -> 15
# 1분 -> 16

# 16 -> 11




# 프로그램 구상
# 1. bandage를 미리 t,x,y로 변수로 저장해놓는게 관리하기 용이할듯
# 2. 최대 체력을 관리해야하므로 현재 체력 curhel로 실제 체력 변수로 관리
# 3. 풀회복패키지 변수를 관리하는 것도 좋을 듯.

# 변수 관리
# t,x,y // 기술 시전 시간, 1초당 회복량, 추가 회복량
# nexttime // 다음 공격 시전까지 남은 시간
# fullpack // 시간 안에 시전을 다하면 총 체력 합

# 구상 코드
# n=len(attacks)
# t,x,y=bandage[0],bandage[1],bandage[2]
# fullpack=t*x+y
# curhel=health

# for i in range(n-1):
#     curhel-=attacks[i][1]
#     if curhel<1:
#         curhel=-1
#         break
#     nexttime=attacks[i+1][0]-curtime
#     if nexttime<t:
#         curhel=min(curhel+nexttime*x,health)
#     else:
#         curhel=min(curhel+fullpack,health)

# answer=curhel
# return answer
# """




def solution(bandage, health, attacks):
    n=len(attacks)
    t,x,y=bandage[0],bandage[1],bandage[2]
    curhel=health

    for i in range(n):
        curhel-=attacks[i][1]
        if curhel<1:
            curhel=-1
            break
        if i==n-1: break

        print(curhel)
        nexttime=attacks[i+1][0]-attacks[i][0]-1
        # if nexttime<t:
        #     curhel=min(curhel+nexttime*x,health)
        # else:
        #     curhel=min(curhel+x*nexttime+nexttime//t*y,health)
        curhel=min(curhel+x*nexttime+nexttime//t*y,health)
        print(curhel)

    print(curhel)
    answer=curhel
    return answer