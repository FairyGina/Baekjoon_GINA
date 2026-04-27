#include <iostream>
using namespace std;
int main(){
    cin.sync_with_stdio(false);
	cin.tie(nullptr);
    while(1){
        int n,res=0;
        cin>>n;
        if(n==0)
            break;
        for(int i=0;i<n;i++){
            res+=(n-i)*(n-i);
        }
        cout<<res<<endl;
    }
    return 0;
}