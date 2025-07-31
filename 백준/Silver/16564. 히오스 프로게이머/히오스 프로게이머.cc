#include<bits/stdc++.h>
#define fastio ios::sync_with_stdio(false); cin.tie(nullptr);
using namespace std;

int n;
long long k;
long long bs(){
    long long l=0,r=1000000001;
    while(l<=r){
        long long m=(l+r)/2,cn=(long long)n*m;
        if(cn<k) l=m+1;
        else if(cn>k)r=m-1;
        else return m;
    }
    return r;
}
int main(){
    fastio;
    cin>>n>>k;
    long long* nb=new long long[n];
    long long* num=new long long[n+1];

    for(int i=0;i<n;i++) cin>>nb[i];
    sort(nb,nb+n);
    num[0] = 0;
    for(int i=0;i<n;i++) num[i+1]=num[i]+nb[i];
    bool bl=true;
    for(int i=0;i<n;i++){
        if(k<nb[i]*i-num[i]){
            k+=num[i];
            n=i;
            bl=false;
            break;
        }
    }
    if(bl) k+=num[n];
    cout<<bs();
}