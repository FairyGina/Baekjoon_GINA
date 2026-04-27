#include<stdio.h>
int main() {
    int r, c;
    scanf("%d %d", &r, &c);
    for (int i = 0; i < r; i++) {
        for (int i = 0; i < c; i++) printf("*");
        printf("\n");
    }
    return 0;
}