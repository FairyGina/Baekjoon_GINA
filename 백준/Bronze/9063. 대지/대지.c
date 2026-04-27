#include <stdio.h>
int main(){
    int n,x,y,xmax=-10001,ymax=-10001,xmin=10001,ymin=10001;
    scanf("%d",&n);
    while(n--){
        scanf("%d %d",&x,&y);
        if(x<xmin) xmin=x;
        if(x>xmax) xmax=x;
        if(y<ymin) ymin=y;
        if(y>ymax) ymax=y;
    }
    printf("%d",(xmax-xmin)*(ymax-ymin));
    return 0;
}