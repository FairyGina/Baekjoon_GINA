"""
목표: 규칙대로 s 출력

입력 변수
s, skip // 문자열
index //자연수

문제 요약
1. 규칙에 따라 문자열을 만들려고 함
    1. 문자열 s의 각 알파벳을 index만큼 뒤의 알파벳으로 교체
    2. index만큼의 뒤 알파벳이 z를 넘으면 a로 돌아감
    3. skip에 있는 알파벳은 제외하고 건너뜀
2

메모장
98+1 -> 99-97 2%26

프로그램 구상
1. 

관리 변수

구상 코드


"""

def solution(s, skip, index):
    # op=[]
    # for c in s:
    #     ct=0
    #     for i in range(index):
    #         if skip.find(chr((ord(c)-97+i)%26+97))>-1:
    #             ct+=1
    #     op.append(chr((ord(c)-97+ct)%26+97))
    # return ''.join(op)
    op=[]
    for c in s:
        ct=0
        i=0
        while i<index:
            bl=True
            print(i)
            c=chr((ord(c)-96)%26+97)
            for j in skip:
                #print(c,j)
                if c==j:
                    bl=False
                    break
            if bl: i+=1
        op.append(c)
    return ''.join(op)
                