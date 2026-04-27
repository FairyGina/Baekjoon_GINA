#include<stdio.h>
#include<math.h>
int main(){
    int n,res=2;
    scanf("%d",&n);
    for(int i=0;i<n;i++) res+=pow(2,i);
    printf("%.0f",pow(res,2));
    return 0;
}