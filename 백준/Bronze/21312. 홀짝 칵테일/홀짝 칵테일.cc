#include <iostream>
#include <algorithm>
using namespace std;
int main(){
    long long a,b,c,max,cock[6]={0};
    cin>>a>>b>>c;
    max=a*b*c;
    if(max%2!=0)
        cout<<max;
    else{
        cock[0]=a;
        cock[1]=b;
        cock[2]=c;
        cock[3]=a*b;
        cock[4]=b*c;
        cock[5]=a*c;
        sort(cock,cock+3);
        for(int i=0;i<6;i++){
            if(cock[i]%2!=0)
                max=cock[i];
        }
        cout<<max;
    }
    return 0;
}
