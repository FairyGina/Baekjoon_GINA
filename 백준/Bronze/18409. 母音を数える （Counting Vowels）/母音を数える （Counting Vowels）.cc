#include <iostream>
#include<string>
using namespace std;
int main(){
    cin.sync_with_stdio(false);
	cin.tie(nullptr);
    int n,res=0;
    string a;
    cin>>n>>a;;
    for(int i=0;i<n;i++)
        if((a[i]=='a')||(a[i]=='e')||(a[i]=='i')||(a[i]=='o')||(a[i]=='u'))
            res++;
    cout<<res;
    return 0;
}