#include <stdio.h>
int main() {
    int w1,h1,w2,h2;
    scanf("%d %d %d %d",&w1,&h1,&w2,&h2);
    if((w1-w2>1)&&(h1-h2>1)) printf("1");
    else printf("0");
    return 0;
}