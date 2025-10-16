#include <stdio.h>
#include<string.h>
#include<stdlib.h>
#include<ctype.h>
int main() {
    char alpha[101] = "";
    char al[27] = { "abcdefghijklmnopqrstuvwxyz" };
    char cro[4] = { "dj=" };
    int i, j, res = 0;
    scanf("%s", alpha, sizeof(char) * 101);
    int size = strlen(alpha);

    for (i = 0; i < size; i++) {
        for (j = 0; j < 3; j++) {
            if (alpha[i] == cro[j]) {
                if (j == 0) {
                    if (alpha[i + 1] == al[25]) {
                        if(alpha[i+2] == cro[2])
                            res--;
                    }
                }
                if (i >= 1) {
                    if (j == 1) {
                        if (alpha[i - 1] == al[11]) {
                            res--;
                        }
                        if (alpha[i - 1] == al[13])
                            res--;
                    }
                }
            }
        }
    }
    for (i = 0; i < size; i++) {
        for (j = 0; j < 27; j++) {
            if (alpha[i] == al[j])
                res++;
        }
    }
    printf("%d", res);

    return 0;
}