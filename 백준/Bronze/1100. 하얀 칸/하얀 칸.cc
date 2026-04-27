#include<stdio.h>
int main() {
    int res = 0;
    for (int i = 0; i < 8; i++) {
        char chess[9] = "";
        scanf("%s", chess);
        for (int j = 0; j < 8; j++) {
            if (chess[j] == 'F')
                if (((i % 2 == 0) && (j % 2 == 0)) || ((i % 2 != 0) && (j % 2 != 0)))
                    res++;
        }
    }
    printf("%d", res);
    return 0;
}