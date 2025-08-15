"""
목표: 사진들의 추억 점수를 photo에 주어진 순서대로 출력

입력 변수
name //그리워하는 사람의 이름 문자열 배열
yearning //사람 별 그리움 점수를 담은 정수 배열
photo // 각 사진에 찍힌 인물의 이름을 담은 이차원 문자열 배열

문제 요약
1. 사진 별로 추억 점수를 매김
2. 추억 점수: 사진 속에 나오는 인물의 그리움 점수를 모두 합산한 값
3. 

주의할 점

메모장

변수 관리

프로그램 구상
1. 포토 길이를 잼
2. 딕셔너리로 값 관리

구상 코드
gre={}
for i in range(len(name)):
    gre[name[i]]=yearning[i]

op=[]
for ph in range(len(photo)):
    ct=0
    for i in ph:
        ct+=gre[i]
    op.append(ct)

"""


def solution(name, yearning, photo):
    gre={}
    for i in range(len(name)):
        gre[name[i]]=yearning[i]
    print(gre)

    op=[]
    for ph in range(len(photo)):
        ct=0
        for i in photo[ph]:
            if i in gre:
                ct+=gre[i]
        op.append(ct)
    answer = op
    return answer