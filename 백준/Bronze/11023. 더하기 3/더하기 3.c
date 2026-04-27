#include<stdio.h>
int main(){
    int n,res=0;
    while(scanf("%d",&n)!=EOF){
        res+=n;
    }
    printf("%d",res);
    return 0;
}