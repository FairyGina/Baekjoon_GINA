#include<bits/stdc++.h>
#define fastio ios::sync_with_stdio(false); cin.tie(nullptr);
using namespace std;

int main(){
    fastio;
    ostringstream as;
    int ti;
    cin>>ti;

    while(ti-->0){
        int n,k,t,m;
        cin>>n>>k>>t>>m;
        t--;
        vector<vector<int>> team(n,vector<int>(4)),tsc(n,vector<int>(k));
        for(int i=0;i<n;i++){
            team[i][3]=i;
        }
        for(int mi=0;mi<m;mi++){
            int i,j,s;
            cin>>i>>j>>s;
            i--; j--;
            if(s>tsc[i][j]) tsc[i][j]=s;
            team[i][1]++;
            team[i][2]=mi;
        }
        for(int i=0;i<n;i++){
            for(int j:tsc[i]) team[i][0]+=j;
        }
        sort(team.begin(),team.end(),[](const auto& a,const auto& b){
            if(a[0]!=b[0]) return a[0]>b[0];
            if(a[1]!=b[1]) return a[1]<b[1];
            return a[2]<b[2];
        });
        for(int i=0;i<n;i++) if(t==team[i][3]) as<<i+1<<'\n';
    }
    cout<<as.str();
    return 0;
}