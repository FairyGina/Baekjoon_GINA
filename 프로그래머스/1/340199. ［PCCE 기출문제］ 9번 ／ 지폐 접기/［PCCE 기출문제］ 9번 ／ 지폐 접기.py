# """
# 목표: 지갑에 넣기 위해 지폐 최소 접는 횟수를 출력

# 지폐마다 크기가 다름
# 지폐 접는 규칙
# 1. 길이가 긴 쪽을 반으로 접음
# 2. 접기 전 길이가 홀수면 접고 소수점 이하는 버림
# 3. 접힌 지폐를 그대로 혹은 90도 돌려서 지갑에 들어가면 그만 접음

# 입력 변수
# wallet //지갑의 가로, 세로 정수 배열
# bill //지폐의 가로, 세로 정수배열

# 주의할 점
# 1. 계속 접었는데 지폐가 지갑에 안 들어가는 경우를 고려해야할 것 같음
# 2. 소수점 버리는 것 // 잘 쓰기
# 3. 경우의 수 그대로/ 90도는 즉, 접힌 직사각형의 가로 세로를 지갑의 가로 세로에 맞물리면 들어간다는 것

# 프로그램 구상
# 문제에 써져있긴함. 일단 저대로 해봄

# 메모장

# 관리 변수
# walmin, walmax //지갑의 짧은, 긴 길이 관리.
# billmin, billmax // 지폐의 짧은, 긴 길이 관리

# 구상 코드

# walmin,walmax=min(wallet[0],wallet[1]),max(wallet[0],wallet[1]) # 지갑 길이 받기
# billmin,billmax=min(bill[0],bill[1]),max(bill[0],bill[1]) # 지폐 길이 받기

# count=0 # 지갑 접은 횟수

# while True:
#     if billmin<walmin and billmax<walmax: break # 돈이 지갑안에 들어가면 스탑
#     billtp=billmax//2
#     billmax=max(billtp,billmin)
#     billmin=min(billtp,billmin)
#     count+=1
# print(count)





# """


def solution(wallet, bill):
    walmin,walmax=min(wallet[0],wallet[1]),max(wallet[0],wallet[1]) # 지갑 길이 받기
    billmin,billmax=min(bill[0],bill[1]),max(bill[0],bill[1]) # 지폐 길이 받기

    count=0 # 지갑 접은 횟수

    while True:
        if billmin<=walmin and billmax<=walmax: break # 돈이 지갑안에 들어가면 스탑
        count+=1
        billtp=billmax//2
        billmax=max(billtp,billmin)
        billmin=min(billtp,billmin)
    #print(count)
    
    
    answer = count
    return answer