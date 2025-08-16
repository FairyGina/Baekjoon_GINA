"""
목표: 무기점의 주인이 무기를 모두 만들기 위해 필요한 철의 무게 출력

입력 변수
number // 기사단원 수
limit //이웃 나라 협약으로 정해진 공격력의 제한수치
power //제한 수치를 초과한 기사가 사용할 무기의 공격력

문제 요약
1. 기사는 1~n번까지 번호가 있고, 무기 구매할거임
2. 자신의 기사 번호의 약수 개수에 해당하는 공격력을 가진 무기를 구매할 거임
3. 이웃나라 협약 때문에 공격력의 제한 수치를 정하고, 제한 수치보다 큰 공격력을 가진 무기를 구매해야하는 기사는 협약 기관에서 정한 공격력을 가지는 무기 구매해야함
4. 

프로그램 구상
1. 약수의 개수를 미리 정하는 건 좀 그런가?
2. number까지 약수의 개수를 1부터 n까지 미리 구하자


변수 관리

구상 코드

메모장
i%j==0

i=16
j=2
i/j

"""


def solution(number, limit, power):
    num=0
    for i in range(1,number+1):
        j,ct=1,0
        while j*j<=i:
            if i%j==0:
                ct+=1
                if j!=i//j: ct+=1
            j+=1
        print(ct)
        if ct>limit:
            num+=power
        else:
            num+=ct
            
    answer = 0
    return num