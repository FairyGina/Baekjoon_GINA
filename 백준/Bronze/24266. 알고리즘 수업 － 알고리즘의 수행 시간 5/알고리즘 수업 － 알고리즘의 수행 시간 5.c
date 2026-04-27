#include <stdio.h>
int main(){
    unsigned long long n,res=0;
    scanf("%llu",&n);
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            for(int k=0;k<n;k++) res++;
        }
    }
    printf("%llu\n3",res);
    return 0;
}