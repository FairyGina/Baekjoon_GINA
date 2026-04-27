#include<stdio.h>
#include<string.h>
int main(){
    int n;
    char s[100001];
    scanf("%d",&n);
    scanf("%s",s);
    for(int i=strlen(s)-5;i<strlen(s);i++) printf("%c",s[i]);
    return 0;
}