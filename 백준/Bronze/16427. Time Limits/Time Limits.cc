#include <iostream>
using namespace std;
int main(){
    int n,s,m,res,max=0;
    cin>>n>>s;
    for(int i=0;i<n;i++){
        cin>>m;
        if(max<m)
            max=m;
    }
    res=max*s;
    if(res%1000!=0){
        res/=1000;
        res++;
    }
    else
        res/=1000;
    cout<<res;
    return 0;
}