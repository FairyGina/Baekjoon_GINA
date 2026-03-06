"""
목표: 1번 노드로부터 가장 멀리 떨어진 노드가 몇 개인지 출력
입력
n // 정점 개수
vertex // 노드
1. 최단 경로로 이동할 때 간선 개수가 가장 많은 노드들


"""

from collections import deque

def solution(n, edge):
    graph=[[] for _ in range(n+1)]
    for x,y in edge:
        graph[x].append(y)
        graph[y].append(x)
    
    cost=[0]*(n+1)
    cost[1]=-1
    dq=deque()
    dq.append((1,0))
    
    while dq:
        x,c=dq.popleft()
        for g in graph[x]:
            if not cost[g]:
                cost[g]=c+1
                dq.append((g,c+1))
    maxct=max(cost)
    
    answer = 0
    for i in range(1,n+1):
        if maxct==cost[i]: answer+=1
    
    return answer