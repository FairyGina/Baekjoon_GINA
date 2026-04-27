#include <stdio.h>
int s[2], a[5];
int main(){
    for(int i = 0; i < 2; i++){
        for(int j = 0; j < 5; j++)
            scanf("%d",&a[j]);
        s[i] = 6*a[0] + 3*a[1] + 2*a[2] + a[3] + 2*a[4];
    }
    for(int i = 0; i < 2; i++)
        printf("%d ",s[i]);
    return 0;
}