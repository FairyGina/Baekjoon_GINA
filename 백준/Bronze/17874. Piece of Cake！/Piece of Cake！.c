#include <stdio.h>
int main() {
    int a,b,c,max=0;
    scanf("%d %d %d",&a,&b,&c);
    if(b<a-b) b=a-b;
    if(c<a-c) c=a-c;
    printf("%d",b*c*4);
    return 0;
}