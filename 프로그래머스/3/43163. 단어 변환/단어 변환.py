"""
목표: 몇 단계를 거쳐 begin을 target으로 변환하는지 단계 출력. 안될 결우 0 출력

입력
begin // 시작 단어
target // 바꿀 단어
word // 단어의 집합

bfs

"""
def f1(w1,w2):
    global wln
    ct=0
    for i in range(wln):
        if w1[i]!=w2[i]:
            ct+=1
    if ct==1: return True
    return False

ans=0
def dfs(begin, target, words,w,dt):
    global tg,ln,ans
    if w==tg:
        ans=dt
        return
    for i in range(ln):
        if words[i] not in wset:
            if f1(w,words[i]):
                wset.add(words[i])
                if dfs(begin, target, words,words[i],dt+1): return
                wset.remove(words[i])
    return 0

tg,ln,wln=0,0,0
wset=set()
def solution(begin, target, words):
    global tg,ln,wln
    tg=target
    ln=len(words)
    wln=len(words[0])
    wset.add(begin)
    
    dfs(begin, target, words,begin,0)
    return ans