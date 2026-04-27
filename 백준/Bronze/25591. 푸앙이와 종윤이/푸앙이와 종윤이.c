#include<stdio.h>
int main(){
    int n,m,a,b,c,d,q,r;
    scanf("%d %d",&n,&m);
    a=100-n,b=100-m;
    c=100-(a+b),d=a*b;
    q=d/100,r=d%100;
    printf("%d %d %d %d %d %d\n%d %d",a,b,c,d,q,r,c+q,r);
    return 0;
}