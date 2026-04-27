#include <stdio.h>
int main(){
    int t;
    scanf("%d",&t);
    while(t--){
        char c;
        int n;
        scanf("%d %c",&n,&c);
        while(n--) printf("%c",c);
        printf("\n");
    }
    return 0;
}