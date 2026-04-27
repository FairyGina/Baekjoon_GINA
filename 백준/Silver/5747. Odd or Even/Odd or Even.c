#include <stdio.h>
int main() {
    while(1){
        int g,a,a1=0,a2=0,b1=0,b2=0,r=0;
        scanf("%d",&g);
        if(g==0) break;
        for(int j=0;j<g;j++){
            scanf("%d",&a);
            if(a%2==0) a2++;
            else a1++;
        }
        for(int j=0;j<g;j++){
            scanf("%d",&a);
            if(a%2==0) b2++;
            else b1++;
        }
        if(a1>b2) r+=b2;
        else r+=a1;
        if(a2>b1) r+=b1;
        else r+=a2;
        printf("%d\n",g-r);
    }
    return 0;
}