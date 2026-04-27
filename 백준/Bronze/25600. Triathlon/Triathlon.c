#include<stdio.h>
int main(){
    int n,max=0;
    scanf("%d",&n);
    while(n--){
        int a,d,g,res=0;
        scanf("%d %d %d",&a,&d,&g);
        res=a*(d+g);
        if(a==(d+g)) res*=2;
        if(max<res) max=res;
    }
    printf("%d",max);
    return 0;
}