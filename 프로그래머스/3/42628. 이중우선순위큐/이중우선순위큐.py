"""
목표: 모든 연산 후 큐가 비면 0,0 아니면 최댓값, 최소값출력

입력
operations // 큐가 수행할 연산

I 숫자 insert
D 1 최댓값 삭제
D -1 최소값 삭제

"""

import heapq

def f1(nbstr):
    if nbstr[0]=='-':
        return -int(nbstr[1:])
    return int(nbstr)
    
def solution(operations):
    hq=[]
    for op in operations:
        opc=op[0]
        nb=f1(op[2:])
        if opc=='I':
            heapq.heappush(hq,nb)
        elif opc=='D' and hq:
            if nb<0:
                heapq.heappop(hq)
            else:
                hq.remove(max(hq))
    
    answer = []
    a1,a2=0,0
    if hq:
        a1=max(hq)
        a2=heapq.heappop(hq)
    
    answer.append(a1)
    answer.append(a2)                
    
    return answer