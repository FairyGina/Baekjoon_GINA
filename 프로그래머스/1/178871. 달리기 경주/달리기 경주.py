"""
목표: 경주 종료 시, 선수들의 이름을 1등부터 순서대로 출력

입력 변수
players //선수들 이름이 1등부터 현재 등수 순서대로 담긴 문자열 배열
callings //해설진이 부른 이름을 담은 문자열 배열

문제 요약

주의할 점
- 2중 포문 사용하면 시초남
- 

메모장
실제 데이터를 바꾸지말고 등수로 한 후에, 플 마로 변경하는 방법을 해야할듯
딕셔너리를 사용해서 인덱스 참조

01234가 있고, a b c d e 이름이 있다면, e가 d를 역전하면 01243이 돼야한다. 매번 소트를 할 순 없는데 직전 등수를 알 수 있는 방법이 뭐지? => 인덱스 번호를 바꾸면 된다. 어떻게?
id["이름"]= 인덱스 이니, 
이름 불린 tmp=id["이름"] -> 인덱스
이 name[인덱스 -1]를 가져와서 전 등수 이름을 가져옴
id[전 등수 이름]=인덱스+1로 가능?
0-a, a-0 쌍으로 만들어서

프로그램 구상

변수 관리
human // 현재 등수 카운트
id// 인덱스 번호

구상 코드
n=len(players)
id,name={},{}

for i in range(n):
    # human[i]=i
    id[players[i]]=i # 키: 이름 값: 등수
    name[i]=players[i] # 키: 등수 값: 이름
    
    
for i in callings: # i: 추월한 플레이어 이름(문자열)
    nb1=id[i] //추월한 플레이어 등수 알아냄(정수)
    user2=name[nb-1] //추월당한 플레이어의 이름 알아냄(문자열)
    nb2=id[user2] //추월당한 플레이어의 인덱스 번호를 알아냄(정수)
    id[i]=nb2
    name[nb2]=i
    id[user2]=nb1
    name[nb1]=user2
    
id.sort()
"""


def solution(players, callings):
    n=len(players)
    number,name={},{}
    for i in range(n):
        # human[i]=i
        number[players[i]]=i # 키: 이름 값: 등수
        name[i]=players[i] # 키: 등수 값: 이름


    for i in callings: # i: 추월한 플레이어 이름(문자열)
        nb1=number[i] #추월한 플레이어 등수 알아냄(정수)
        user2=name[nb1-1] #추월당한 플레이어의 이름 알아냄(문자열)
        nb2=number[user2] #추월당한 플레이어의 인덱스 번호를 알아냄(정수)
        number[i]=nb2
        name[nb2]=i
        number[user2]=nb1
        name[nb1]=user2
        
    answer=list(name.values())
    # print(name)
#     answer=id
    return answer