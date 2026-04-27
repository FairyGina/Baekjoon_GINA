#include <stdio.h>
int main(){
    int t;
    scanf("%d",&t);
    while(t--){
        int n,m;
        scanf("%d %d",&n,&m);
        if((n>11)&&(m>3)){
            printf("%d\n",4+11*m);
        }
        else printf("-1\n");
    }
    return 0;
}