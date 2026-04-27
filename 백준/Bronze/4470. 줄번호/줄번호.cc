#include <iostream>
using namespace std;
int main(){
    int n;
    char num[51];
    cin>>n;
    cin.ignore();
    for(int i=1;i<=n;i++){
        cin.getline(num,51,'\n');
        cout<<i<<". "<<num<<endl;
    }
    return 0;
}