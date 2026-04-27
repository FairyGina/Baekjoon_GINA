#include <stdio.h>
int main() {
    int a;
    scanf("%d",&a);
    while(a--){
        int n;
        scanf("%d",&n);
        while(1){
            if(n%2==1){
                if(n>1)printf("Gazua\n");
                else printf("GoHanGang\n");
                break;
            }
            n/=2;
        }
    }
    return 0;
}