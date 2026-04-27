#include <stdio.h>
int main(){
    unsigned long long sum=0;
    int n;
    scanf("%d",&n);
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++)
            sum++;
    }
    printf("%llu\n2",sum);
    return 0;
}