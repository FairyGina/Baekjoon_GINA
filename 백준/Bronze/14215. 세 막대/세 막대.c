#include <stdio.h>
int main(){
    int max=0,t[3];
    for(int i=0;i<3;i++){
        scanf("%d",&t[i]);
        if(max<t[i]) max=t[i];
    }
    if((t[0]+t[1]+t[2]-max)<=max) printf("%d",2*(t[0]+t[1]+t[2]-max)-1);
    else printf("%d",t[0]+t[1]+t[2]);
    return 0;
}