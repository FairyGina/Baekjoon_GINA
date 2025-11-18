#include <stdio.h>
#include<ctype.h>
#include<string.h>
int main() {
    char s[101] = { 0 };
    char a[27] = "abcdefghijklmnopqrstuvwxyz";
    int answer[27] = { 0 };
    int res[27] = { 0 };
    int i,j;
    scanf("%s", &s);
    int size = strlen(s);
  
    for (i = 0; i < size; i++) {
        for (j = 0; j < 27; j++) {
            if (res[j] == 0) {
                if (s[i] == a[j]) {
                    answer[j] = i;
                    res[j]++;
                }
            }
        }
    }

 
    for (i = 0; i < 27; i++) {
        if (res[i] == 0)
            answer[i] = -1;

    }
    for (i = 0; i < 26; i++) {
        printf("%d ", answer[i]);
    }

    return 0;
}