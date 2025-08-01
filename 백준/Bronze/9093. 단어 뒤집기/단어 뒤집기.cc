#include<bits/stdc++.h>
#define fastio ios::sync_with_stdio(false); cin.tie(nullptr);
using namespace std;
int main(){
    fastio;
    ostringstream as;
    int ti;
    cin>>ti;
    cin.ignore();
    while(ti--){
        string s,tk;
        getline(cin,s);
        istringstream is(s);
        while(is>>tk){
            reverse(tk.begin(),tk.end());
            as<<tk<<' ';
        }
        as<<'\n';
    }
    cout<<as.str();
}