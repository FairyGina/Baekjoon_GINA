#include <stdio.h>
int main(){
    int x,n,p,u=0;
    scanf("%d %d",&x,&n);
    for(int i=0;i<n;i++){
        u+=x;
        scanf("%d",&p);
        u-=p;
    }
    printf("%d",u+x);
    return 0;
}