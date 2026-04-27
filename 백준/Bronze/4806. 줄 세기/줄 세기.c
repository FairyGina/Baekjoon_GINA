#include <stdio.h>
int main(){
    int i=0;
    char c;
    while(scanf("%c",&c)!=EOF){
        if(c=='\n') i++;
    }
    printf("%d",i);
    return 0;
}