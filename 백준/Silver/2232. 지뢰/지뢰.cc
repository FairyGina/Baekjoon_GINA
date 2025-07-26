#include<bits/stdc++.h>
#define fastio ios::sync_with_stdio(false); cin.tie(nullptr);
using namespace std;
static int nb[5*int(1e5)+2];
int main(){
    fastio;
    ostringstream as;
    int n;
    cin>>n;
    for(int i=1;i<=n;i++){
        cin>>nb[i];
    }
    for(int i=1;i<=n;i++){
        if((nb[i-1]<=nb[i])&&(nb[i]>=nb[i+1])){
            as<<i<<'\n';
        }
    }
    cout<<as.str();
    return 0;
}