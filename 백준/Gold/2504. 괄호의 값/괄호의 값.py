import sys
def input(): return sys.stdin.readline().rstrip()
st,dp=[],[1]*30
top=-1
ip=input()
for c in ip:
    if c=='(' or c=='[':
        top+=1
        st.append(c)
    else:
        if c==')':
            if top<0 or st[top]!='(':
                dp[0]=0
                break
            p=2
        else:
            if top<0 or st[top]!='[':
                dp[0]=0
                break
            p=3
        st.pop()
        if dp[top]<2: dp[top]=0
        dp[top]+=dp[top+1]*p
        dp[top+1]=1
        top-=1
if st: dp[0]=0
print(dp[0])