#include<stdio.h>
int main(){
    int a,b;
    scanf("%d %d",&a,&b);
    for(int i=a;i<=b;i+=60) printf("All positions change in year %d\n",i);
    return 0;
}