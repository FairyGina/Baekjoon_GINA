#include<iostream>
#include<sstream>
#include<algorithm>
#include<vector>
using namespace std;
int main(){
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int n,a,b,c,max=0;
    cin>>n>>a>>b>>c;
    vector<int> pz(n),num(n+1);
    for(int i=0;i<n;i++){
        cin>>pz[i];
    }
    sort(pz.begin(),pz.end(),greater<int>());
    for(int i=0;i<n;i++){
        num[i+1]=pz[i]+num[i];
    }
    n++;
    for(int i=0;i<n;i++){
        int td=(c+num[i])/a;
        if(td>max) max=td;
        a+=b;
    }
    cout<<max;
    return 0;
}