import sys
def input(): return sys.stdin.readline().rstrip()

def f1():
    ans=0
    st=set()
    for _ in range(int(input())):
        ta=list(map(int,input().split()))
        for i in ta:
            if i in st:
                ans=1
                return ans
            st.add(i)
    return ans

print(f1())