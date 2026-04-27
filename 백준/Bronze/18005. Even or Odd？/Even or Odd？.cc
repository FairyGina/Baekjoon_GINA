#include <iostream>
using namespace std;
int main(){
    unsigned int n;
    int res;
    cin >> n;
    if (n%2==0){
        if ((n/2)%2==0)
             res = 2;
        else
             res = 1;
    }
    else
        res = 0;
    cout << res << endl;
    return 0;
}