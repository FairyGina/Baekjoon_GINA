#include<stdio.h>
#include<string.h>
int main() {
    int res = 0;
    char alpha[101];
    scanf("%s", alpha);
    for (int i = 0; i < strlen(alpha); i++) {
        if ((alpha[i] == 'a') || (alpha[i] == 'e') || (alpha[i] == 'i') || (alpha[i] == 'o') || (alpha[i] == 'u'))
            res++;
    }
    printf("%d", res);
    return 0;
}