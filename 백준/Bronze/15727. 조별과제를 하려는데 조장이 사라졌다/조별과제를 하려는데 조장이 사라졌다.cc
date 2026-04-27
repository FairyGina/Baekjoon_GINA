#include <stdio.h>
int main(){
    unsigned int L;

    scanf("%d", &L);

    if (L % 5 == 0)
        printf("%d", L/5);
    if (L % 5 > 0)
        printf("%d", L/5+1);

    return 0;
}