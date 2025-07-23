#include<iostream>
#include<sstream>
#include<cstring>
#include<algorithm>
using namespace std;
int main(){
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    ostringstream as;
    int ct[10001];
    while(true){
        int n,m;
        cin>>n>>m;
        if(n+m==0) break;
        fill(ct,ct+10001,0);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int tn;
                cin>>tn;
                ct[tn]++;
            }
        }
        int cm=*max_element(ct,ct+10001);
        for(int i=0;i<10001;i++){
            if(cm==ct[i]) ct[i]=0;
        }
        cm=*max_element(ct,ct+10001);
        for(int i=0;i<10001;i++){
            if(cm==ct[i]){
                as<<i<<' ';
            }
        }
        as<<'\n';
    }
    cout<<as.str();
    return 0;
}