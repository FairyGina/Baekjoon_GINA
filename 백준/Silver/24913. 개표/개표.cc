#include <iostream>
#include <sstream>
using namespace std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    ostringstream as;

    long n,q,jg=0,num=0,mx=0;
    cin>>n>>q;

    int lm=(int)n+1;
    int nb[100001]={0};
    
    while(q--){
        int a,x,y;
        cin>>a>>x>>y;
        if(a==1){
            if(y==lm) jg+=x;
            else{
                num+=x;
                nb[y]+=x;
                if(mx<nb[y]) mx=nb[y];
            }
        }else{
            long tjg=jg+x;
            if(tjg<=mx) as<<"NO\n";
            else if(n*--tjg-num>=y) as<<"YES\n";
            else as<<"NO\n";
        }
    }
    
    cout<<as.str();
    return 0;
}