#include<stdio.h>
#include<string.h>
int main(){
    int n;
    char s[101];
    scanf("%d %s",&n,s);
    if(s[n-1]!='G') printf("%sG",s);
    else for(int i=0;i<n-1;i++) printf("%c",s[i]);
    return 0;
}