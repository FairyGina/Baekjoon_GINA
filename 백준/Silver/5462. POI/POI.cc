#include<iostream>
#include<sstream>
#include<fstream>
#include<algorithm>
#include<vector>

using namespace std;
struct Pn{
    int sc,ct,id;
};
int main(){
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int n,t,p;
    cin>>n>>t>>p;
    p--;
    vector<vector<int>> hm(n+1,vector<int>(t,0));
    vector<Pn> pn(n);
    for(int i=0;i<n;i++){
        for(int j=0;j<t;j++){
            cin>>hm[i][j];
            if(hm[i][j]==0) hm[n][j]++;
        }
    }
    for(int i=0;i<n;i++){
        int sc=0,ct=0;
        for(int j=0;j<t;j++){
            if(hm[i][j]==1){
                ct++;
                sc+=hm[n][j];
            }
        }
        pn[i]={sc,ct,i};
    }

    sort(pn.begin(),pn.end(),[](const Pn& a,const Pn& b){
        if(a.sc!=b.sc) return a.sc>b.sc;
        if(a.ct!=b.ct) return a.ct>b.ct;
        return a.id<b.id;
    });
    for(int i=0;i<n;i++){
        if(pn[i].id==p){
            cout<<pn[i].sc<<" "<<i+1;
        }
    }
    return 0;
}