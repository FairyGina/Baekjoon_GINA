"""
목표: 문자열을 작성하기 위해 키를 최소 몇 번 눌러야하는지 출력

입력 변수
keymap //1번 키부터 차례대로 할당된 문자들이 순서대로 담긴 문자열 배열
targets // 입력하려는 문자열들이 담긴 문자열 배열

문제 요약
1. 핸드폰 천지인 타자가 있음
2. 같은 문자가 자판 전체에 여러 번 할당되기도 하고, 키 하나에 같은 문자가 여러 번 할당됐을 수도 있음
3. 또 아예 없기도 해서 작성 불가능 경우도 존재 이럴 경우 -1출력

프로그램 구상
1. 문자마다 최소 접근 값을 추가해야함. 딕셔너리로 관리하면 될듯
2. keymap은 일단 딕셔너리로 관리하고, 타켓으로 관리하면 될듯.
3. 문자 없는 경우도 꼭 관리해야함

변수 관리

구상 코드

"""


def solution(keymap, targets):
    keyboard={}
    for km in keymap:
        for i in range(len(km)):
            if km[i] in keyboard and keyboard[km[i]]<i+1: continue
            keyboard[km[i]]=i+1
            
    # print(keyboard)
    
    answer=[]
    for tg in targets:
        ct=0
        for i in tg:
            if i not in keyboard:
                ct=-1
                break
            ct+=keyboard[i]
        answer.append(ct)
            
    # answer = []
    return answer