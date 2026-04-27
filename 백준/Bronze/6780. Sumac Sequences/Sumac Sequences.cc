#include <iostream>
using namespace std;
int main(){
    unsigned int a,b,i=2,res;
    cin>>a>>b;
    while(1){
        res=a-b,i++;
        if(res>b)
            break;
        a=b;
        b=res;
    }
    cout<<i;
    return 0;
}