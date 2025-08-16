"""
목표: 부분 문자열 수가 p보다 작거나 같은 횟수 출력

입력 변수
t,p// 문자열. t는 전체 p는 목표 문자열

문제 요약
1. 전체 문자열 t를 입력받고 p의 길이만큼 문자열을 전부 잘라서 p와 비교해 작거나 같은 횟수 출력

프로그램 구상


관리 변수

구상 코드
plen=len(p)
gp="0"
def(s):
    for i in range(plen):
        if s[i]>gp[i]:
            return False
    return True

"""
plen=0
gp="0"
def sst(s):
    global gp,plen
    print(s,gp)
    for i in range(plen):
        print(s[i],gp[i])
        if int(s[i])>int(gp[i]):
            return False
        elif int(s[i])<int(gp[i]): return True
    return True

def solution(t, p):
    global gp,plen
    ct=0
    plen=len(p)
    gp=p
    tlen=len(t)-plen+1
    for i in range(tlen):
        if sst(t[i:i+plen]):
            ct+=1
    return ct