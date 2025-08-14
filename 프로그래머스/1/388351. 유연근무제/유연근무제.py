"""
출근 희망시각+10분
토/일은 이벤트 영향x
모든 시각은 시에 100을 곱하고 분을 더한 정수로 표현 -> 9시 58분: 958

목표: 작원들이 설정한 출근 희망 시각과 실제 출근 기록으로 상품을 받을 직원이 몇 명인지 확인
조건
- 상품은 일주일동안 늦지 않고 출근한 직원들에게 줌

n: 직원 명수
schedules: 출근 희망 시간 1차원 정수배열
timelogs: 직원들이 일주일동안 출근한 시각을 담은 2차원 정수 배열
startday: 이벤트 시작 요일

=> 상품을 받을 직원 수 return

주의할 점
* 1~7 월~일

프로그램 구상
1. 시작한 요일에 맞춰 토/일 위치를 알아내 지나가야함
2. 시간을 입력받으면, 이 사람이 정한 시간(정한 시간도 미리 수식으로 시간 계산 해놓기)과 비교해서 넘었는지 확인해야함 => 시간 계산 수식 마련
    710 => 7시 10분 => 7*60+10 => 430 time/100*60+time%100으로 총 시간 계산
3. 혹여나 23:00 출근 시간이고 01:00에 출근일 경우 넘은 건데, 이런 경우가 존재할까 봤지만 출근 시간은 7:00~11:00 고정, 직원 실제 출근 시간은 6:00~23:59

n=len(schedules) # 직원 수 알아내기
sch=[0]*n # 직원수만큼 약속시간을 수식 계산 P2
for i in range(n):
    time=schedules[i]
    sch[i]=time/100*60+time%100+10 # 10분 더 더함(제한)

// 여기까지 직원 약속시간 저장 print 요청

startday-=1 # 실제 요일은 인덱스 0으로 시작하므로 미리 1을 뺌

score=[true]*n # 직원들 점수 저장
for i in range(n): # 직원마다
    day=startday
    for j in range(7): # 일주일 동안
        time=timelogs[i][startday]
        curtime=time/100*60+time%100
        if curtime>score[i]: # 한 번이라도 늦으면 상품이 없음
            score[i]=False
            break
        day=(day+1)%7 # 날짜를 하루씩 증가
        
// 여기까지 직원들 점수 저장

present=0
for i in range(n):
    if score[i]: present+=1

return present


* 필기 *
time/100*60+time%100

436=time/100*60+time%100

436 = 7:16..입력이 716 자체가 없는데 도대체 어디서 나온거임
"""

def solution(schedules, timelogs, startday):
    n=len(schedules) # 직원 수 알아내기
    sch=[0]*n # 직원수만큼 약속시간을 수식 계산 P2
    
    for i in range(n):
        time=schedules[i]
        sch[i]=int(time//100*60+time%100+10) # 10분 더 더함(제한)
    
    # print("sch 출력")
    # for i in range(n):
    #     print(sch[i]) # *여기까지 직원 약속시간 저장 print 요청
    # print()

    startday=(startday-1)%7 # 실제 요일은 인덱스 0으로 시작하므로 미리 1을 뺌

    score=[True]*n # 직원들 점수 저장
    
    # for i in timelogs:
    #     print(i)
    
    for i in range(n): # 직원마다
        day=startday
        
        for j in range(7): # 일주일 동안
            #print(day)
            if day==5 or day==6:
                day=(day+1)%7 # 날짜를 하루씩 증가
                continue # 주말은 지나가야함
            curtime=int(timelogs[i][j]//100*60+timelogs[i][j]%100)
            # print(curtime)
            # print()
            if curtime>sch[i]: # 한 번이라도 늦으면 상품이 없음
                score[i]=False
                break
            day=(day+1)%7 # 날짜를 하루씩 증가
            # print(day)
            # print()

    # print()
    # print("직원점수 출력")
    # for i in range(n):
    #     print(score[i]) # *여기까지 직원들 점수 저장

    present=0
    for i in score:
        if i: present+=1

    answer = present
    return answer