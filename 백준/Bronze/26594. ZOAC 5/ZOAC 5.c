#include <stdio.h>
#include<string.h>
int main(){   
    char s[1000001];
    scanf("%s",s);
    char a=s[0];
    int i=0;
    for(;i<strlen(s);i++) if(s[0]!=s[i]) break;
    printf("%d",i);
    return 0;
}