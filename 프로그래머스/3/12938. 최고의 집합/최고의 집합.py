"""

목표: 최고의 집합 출력 없으면 -1 출력

입력
n //원소의 개수
s // 모든 원소들의 합

1. 교집합 말하는거임?
2. 합의 s면서 곱이 최대 -> 곱이 최대?

시복도 계산이 문젠데

중간에 있는 숫자가 과연 최고의 곱일까?
-> 

3 1,2
4 1,3 2,2
5 1,4 2,3
6 1,5 2,4 3,3
맞는것같은디

규칙 찾기로 갈까 아니면 약수화?

"""

def solution(n, s):
    if n>s: return [-1]
    
    mid=s//n
    avg=s%n
    answer = []
    for i in range(n):
        answer.append(mid)
    for i in range(avg):
        answer[i]+=1
    answer.sort()
    

    return answer