"""
목표: 오늘 파기해야할 개인정보 번호를 오름차순으로 출력

입력 변수
n // 개인정보 개수 1~n번
today // 오늘 날짜 문자열
    YYYY.MM.DD
terms // 약관의 유효기간 1차원 문자열 배열
    terms의 원소: 약관 종류 / 유효기간
        약관 종류: A~Z 한 글자로 terms 배열 내 중복 없음
        유효기간: 개인 정보를 보관할 수 있는 달 정 수 1~100
privacies // 수집된 개인정보의 정보 1차원 문자열 배열
    i+1번 개인정보의 수집 일자와 약관 종류
    날짜 / 약관 종류

문제 요약

프로그램 구상
1. 날짜 비교를 그냥 변수로 만들어서 관리해도 될 것 같음 F
    달 -> (yyyy-2000)*12*28+mm*28+dd로 관리
2. 약관 종류는 딕셔너리로 관리
3. 약관에 따라 유효 기간을 저장해야함. 달이니까 28*month로 추가하고 비교해야할 것 같음.
변수 관리

구상 코드
alpha={}


def chday(s):
    yyyy,mm,dd=s.strip().split('.')
    return (yyyy-2000)*12*28+mm*28+dd

def S:
    current=chday(today)
    for t in terms: # 달로 입력 받는 유효기간 일수로 딕셔너리 관리
        a,b=t.strip().split(" ")
        alpha[a]=int(b)*28
        
    op=[]
    for i in len(privacies):
        s,a=privacies[i].strip().split(" ")
        time=chday(s)+alpha[a]
        if time>=current:
            op.append(i+1)
    return op
"""

alpha={}


def chday(s):
    yyyy,mm,dd=map(int,s.strip().split('.'))
    return (yyyy-2000)*12*28+mm*28+dd

def solution(today, terms, privacies):
    current=chday(today)
    for t in terms: # 달로 입력 받는 유효기간 일수로 딕셔너리 관리
        a,b=t.strip().split(" ")
        alpha[a]=int(b)*28
        
    op=[]
    for i in range(len(privacies)):
        s,a=privacies[i].strip().split(" ")
        time=chday(s)+alpha[a]
        if time<=current:
            op.append(i+1)
    return op