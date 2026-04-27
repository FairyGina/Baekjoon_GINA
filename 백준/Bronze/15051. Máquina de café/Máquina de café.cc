#include <iostream>
using namespace std;
int main(){
    int a,b,c,min;
    cin>>a>>b>>c;
    min=2*(b+2*c);
    if(2*(a+c)<min)
        min=2*(a+c);
    if(2*(2*a+b)<min)
        min=2*(2*a+b);
        cout<<min;
    return 0;
}