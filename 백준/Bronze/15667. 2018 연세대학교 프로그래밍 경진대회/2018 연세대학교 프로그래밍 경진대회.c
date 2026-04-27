#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    for(int k=1;k<n;k++){
        if((n-1)==(k*(k+1))){
            printf("%d",k);
            break;
        }
    }
    return 0;
}