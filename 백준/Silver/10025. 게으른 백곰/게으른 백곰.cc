#include<bits/stdc++.h>
#define fastio ios::sync_with_stdio(false); cin.tie(nullptr);
using namespace std;
static int nb[int(1e6)+1];
int main(){
    fastio;
    int n,k,s=0,lm=int(1e6)+1,mxi=0,mni=lm;
    cin>>n>>k;
    k*=2;
    for(int i=0;i<n;i++){
        int g,x;
        cin>>g>>x;
        s+=g;
        nb[x]=g;
        if(mxi<x) mxi=x;
        if(mni>x) mni=x;
    }
    n=-1;
    int num=0;
    if(mni+k<lm){
        n=mni+k+1;
        for(int i=mni;i<n;i++){
            num+=nb[i];
        }
        n=num;
    }
    for(int i=mni+k+1;i<=mxi;i++){
        num=num-nb[i-k-1]+nb[i];
        if(num>n) n=num;
    }
    cout<<((n<0)?s:n);
    return 0;
}