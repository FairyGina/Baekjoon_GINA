#include <stdio.h>
#include<string.h>
#include<stdlib.h>
int main() {
    int n,m = 0, i, d;
    char a[101] = "";
    
    scanf("%d", &n);
    scanf("%s", a,sizeof(char)*101);
    int size = strlen(a);
    

    for (i = 0; i < size; i++) {
        m = m + a[i]-'0';
    }
    printf("%d", m);


    return 0;
}