#include<stdio.h>
int main() {
    int year;
    while (1) {
        scanf("%d", &year);
        if (year == 0)
            break;
        printf("%d ", year);
        if ((year % 4 == 0) && (year > 1895)) {
            if (year > 2020)
                printf("No city yet chosen\n");
            else if ((year / 4 == 479) || (year / 4 == 485) || (year / 4 == 486))
                printf("Games cancelled\n");
            else
                printf("Summer Olympics\n");
        }
        else
            printf("No summer games\n");
    }
    return 0;
}