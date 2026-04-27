#include <iostream>
using namespace std;
int main(){
    int a,b;
    while(1){
        cin>>a>>b;
        if(a+b==0)
            break;
        if((a-b)%2==0)
            cout<<(a-b)/2<<" "<<0<<"\n";
        else{
            if(a-b>2)
                cout<<(a-b-3)/2<<" "<<1<<"\n";
            else
                cout<<0<<" "<<0<<"\n";
        }
    }
    return 0;
}