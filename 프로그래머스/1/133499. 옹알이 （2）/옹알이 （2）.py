"""
목표: 머쓱이의 조카가 발음할 수 있는 단어의 개수 출력

입력 변수
babbling // 문자열 배열

문제 요약
1. 네 가지 발음과 네 가지 발음을 조합해 만드는 발음만 가능하고, 연속 같은 발음 불가능

프로그램 구상
1. 한 문자열을 받을 때, 만약 포함되는 문자열이 존재하면 그 문자열을 순차적 제거하며, 남은 문자열이 제거 불가능한 문자열이면 False를 반환
2. 그냥 무식하게 제거하면 앞 뒤가 합쳐져서 가능 문자열이 될 수도 있음-> 무조건 인덱스 0부터 살펴봐야함. 짝수는 3글자, 홀수는 2글자.

"""
bal={0:"aya", 1:"ye", 2:"woo", 3:"ma" }

def joka(s):
    global bal
    idx,lt=0,len(s)
    sv=-1
    while idx<lt:
        bl=True
        i=0
        while i<4:
            if sv==i:
                i+=1
                continue
            if i%2==0 and idx+2<lt:
                if s[idx:idx+3]==bal[i]:
                    #print(s[idx:idx+3])
                    idx+=3
                    sv=i
                    bl=False
                    break
            
            elif idx+1<lt:
                if s[idx:idx+2]==bal[i]:
                    #print(s[idx:idx+2])
                    idx+=2
                    sv=i
                    bl=False
                    break
            i+=1
        if bl: return False
        
    
    #print(idx)
    if idx!=lt: return False
    return True

def solution(babbling):
    ct=0
    for i in babbling:
        if joka(i):
            ct+=1
    return ct