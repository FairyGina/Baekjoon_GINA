#include <stdio.h>
int main() {
    int p,q;
    scanf("%d %d",&p,&q);
    if(p<51&&q<11) printf("White");
    else if(q>30) printf("Red");
    else printf("Yellow");
    return 0;
}