#include <stdio.h>
#include<string.h>
int main(){
    char s[33];
    scanf("%s",s);
    int res=0;
    for(int i=0;i<strlen(s);i++) res+=s[i]!='_'?1:6;
    printf("%d",res+2);
    return 0;
}