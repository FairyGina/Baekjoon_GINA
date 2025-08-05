#include<bits/stdc++.h>
#define fastio ios::sync_with_stdio(false); cin.tie(nullptr);
using namespace std;
static const unsigned long long lm=LLONG_MAX;
int ten(int lt,string s,vector<int>& arr){
    int ct=0,mx=0;
    while(--lt>=0){
        char c=s[lt];
        if(c>'9') arr.push_back(((int)c)-87);
        else arr.push_back(((int)c)-'0');
        if(mx<arr[ct]) mx=arr[ct];
        ct++;
    }
    return mx;
}
void gn(int lt,int mx,vector<int>& arr,long long* nb){
    for(int mt=mx;mt<37;mt++){
        long long num=0;
        for(int pw=0;pw<lt;pw++){
            long long mul=1;
            for(int k=0;k<pw;k++){
                if(mul>lm/mt){
                    num=lm;
                    break;
                }
                mul*=mt;
            }
            if(num==lm) break;
            if(arr[pw]>0&&mul>lm/arr[pw]){
                num=lm;
                break;
            }
            mul*=arr[pw];
            if(num>lm-mul){
                num=lm;
                break;
            }
            num+=mul;
        }
        if(num<lm) nb[mt]=num;
    }
}
int main(){
    fastio;
    string a,b;
    cin>>a>>b;
    vector<int> ta,tb;
    long long na[37],nb[37];
    fill(na,na+37,-1LL); fill(nb,nb+37,-1LL);
    int amx,bmx,alt=a.length(),blt=b.length();
    amx=ten(alt,a,ta);
    bmx=ten(blt,b,tb);
    amx++; bmx++;
    amx=max(2,amx); bmx=max(2,bmx);
    gn(alt,amx,ta,na);
    gn(blt,bmx,tb,nb);
    
    int ct=0;
    for(int i=amx;i<37;i++){
        if(na[i]<0) continue;
        for(int j=bmx;j<37;j++){
            if(i!=j&&na[i]==nb[j]){
                ct++;
                alt=i; blt=j;
            }
        }
    }

    if(ct<1) cout<<"Impossible";
    else if(ct<2) cout<<na[alt]<<" "<<alt<<" "<<blt;
    else cout<<"Multiple";
}
