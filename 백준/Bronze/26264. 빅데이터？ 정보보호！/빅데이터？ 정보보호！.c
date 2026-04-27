#include <stdio.h>
#include<string.h>
int main(){
    int b=0,s=0,n;
    char sb[800001];
    scanf("%d %s",&n,sb);
    for(int i=0;i<strlen(sb);i++){
        if(sb[i]=='s') s++;
        else if(sb[i]=='b') b++;
    }
    if(s<b) printf("bigdata? ");
    else if(s>b) printf("security!");
    else printf("bigdata? security!");
    return 0;
}