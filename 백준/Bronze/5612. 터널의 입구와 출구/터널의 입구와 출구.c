#include <stdio.h>
int main(){
    int n,m;
    scanf("%d %d",&n,&m);
    int max=m;
    while(n--){
        int a,b;
        scanf("%d %d",&a,&b);
        m=m+a-b;
        if(m<0){max=0; break;}
        if(max<m) max=m;
    }
    printf("%d",max);
    return 0;
}