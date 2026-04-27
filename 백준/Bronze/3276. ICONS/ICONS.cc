#include <iostream>
#include<cmath>
using namespace std;
int main(){
    cin.sync_with_stdio(false);
	cin.tie(nullptr);
    int a,n;
    cin>>n;
    a=sqrt(n);
    for(int i=a;i<a+3;i++){
        if(a*i>=n){
            if(i-a==2)
                cout<<a+1<<" "<<a+1;
            else
                cout<<a<<" "<<i;
            break;
        }
    }
    return 0;
}