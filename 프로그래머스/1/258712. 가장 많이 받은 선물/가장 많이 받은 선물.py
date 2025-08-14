# """
# 목표: 다음 달에 가장 많은 선물을 받을 친구가 받을 선물 수 출력

# 입력 변수
# friends //친구들의 이름 1차원 문자열 배열
# gifts // 이번 달까지 친구들이 주고받은 선물 기록 1차원 문자열 배열
# gifts의 한 원소는 a,b로 구성되며, a: 선물을 준 친구 이름 b: 선물을 받은 친구

# 문제 요약
# 1. 카카오톡 선물하기 기능 사용
# 2. 두 사람이 선물을 주고받은 기록이 있다면, 두 사람 사이에 더 많은 선물을 준 사람이 다음 달에 선물을 하나 받음
# 3. 기록이 없거나 같다면, 선물 지수가 더 큰 사람이 작은 사람에게 선물을 하나 받음
#     => 선물 지수 a>b => a+=1 b는? 빼나?
#     - 선물 지수: 이번 달까지 자신이 친구들에게 준 선물 수 - 받은 선물 수
#     - 선물지수마저 같다면 선물을 주고받지 않음
    


# 주의할 점

# 메모장

# 프로그램 구상
# 1. 일단 선물을 준 카운트, 선물을 받은 카운트를 따로 관리해야할 것 같음
# 2. 문자열 - 인덱스 번호로 관리해야겠음. 저장 인덱스
# 3. gifts 배열을 받고, 일단 1에다 저장
#     //프린트 요청
# 4. 두 사람 사이 선물을 주고받은 기록을 만들어야함. 즉, n*n 배열을 만들고 0로 초기화 후, 배열을 입력받을 때 +1씩 하면서 두 사람 간 선물을 준 카운트를 세야함 ume
# 5. 사람마다 선물 총 개수도 세야함. 진짜 뒤지게 셀거 많네 giftct
# 6. 기록 유무는 ume[i][j]가 0 이상이면 거래 기록이 있음으로 판정. i==j인 경우는 넘겨야함.

# 관리 변수
# n // friends 길이
# giftct[n] //사람 당 선물을 주고(++), 받은 카운트(--) 저장
# ume[n][n] //사람-사람당 주고받은 선물의 개수. 행을 기준으로 열 인덱스에게 선물을 준 거 카운트.
# hm // 친구 당 인덱스 관리 해쉬맵
# count[n] // 다음 달에 선물받을 횟수

# 구상 코드

# n=len(friends)
# giftct,count=[0]*n,[0]*n
# ume=[[False]*n for _ in range(n)]
# hm={}

# for i in range(n): # 친구 인덱스 저장
#     hm[friends[i]]=i
    
# for i in range(len(gifts)): # 선물 주고받은 명단을 카운트 배열에 저장
#     a,b=map(input().strip().split())
#     ume[hm[a]][hm[b]]+=1
#     ume[hm[b]][hm[a]]-=1
#     giftct[hm[a]]+=1
#     giftct[hm[b]]+=1
    
# for i in range(n):
#     for j in range(i,n):
#         if ume[i][j]!=0:
#             a,b=ume[i][j],ume[j][i]
#             if a>b:
#                 count[i]+=1
#                 continue
#             elif a<b:
#                 count[j]+=1
#                 continue
#         a,b=giftct[i][j],giftct[j][i]
#         if a>b: conut[i]+=1
#         elif a<b: count[i]+=1

# return max(count)




# """

def solution(friends, gifts):
    
    n=len(friends)
    giftct,count=[0]*n,[0]*n
    ume=[[0]*n for _ in range(n)]
    hm={}

    for i in range(n): # 친구 인덱스 저장
        hm[friends[i]]=i

    for i in range(len(gifts)): # 선물 주고받은 명단을 카운트 배열에 저장
        a,b=gifts[i].strip().split()
        ume[hm[a]][hm[b]]+=1
        ume[hm[b]][hm[a]]-=1
        giftct[hm[a]]+=1
        giftct[hm[b]]-=1
        
    #print(*ume)
    #print(giftct)

    for i in range(n):
        for j in range(i,n):
            if ume[i][j]!=0:
                a,b=ume[i][j],ume[j][i]
                if a>b:
                    count[i]+=1
                    continue
                elif a<b:
                    count[j]+=1
                    continue
            a,b=giftct[i],giftct[j]
            if a>b: count[i]+=1
            elif a<b: count[j]+=1

    answer=max(count)
    return answer