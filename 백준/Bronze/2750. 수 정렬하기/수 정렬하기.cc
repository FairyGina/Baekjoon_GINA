#include <stdio.h>
int main() {
    int n, i, j, temp, least;
    int num[1001] = { NULL };
    scanf("%d", &n);
    for (i = 0; i < n; i++) {
        scanf("%d", &num[i]);

    }
    for (i = 0; i < n; i++) {
        least = i;
        for (j = i + 1; j < n; j++) {
            if (num[j] < num[least])
                least = j;
        }
        temp = num[i];
        num[i] = num[least];
        num[least] = temp;
    }
    for (i = 0; i < n ; i++) {
        printf("%d ", num[i]);
        printf("\n");
    }

    return 0;
}