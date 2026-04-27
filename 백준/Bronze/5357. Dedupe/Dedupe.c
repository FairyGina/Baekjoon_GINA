#include<stdio.h>
#include<string.h>
int main(){
    int n;
    scanf("%d",&n);
    while(n--){
        char s[101];
        scanf("%s",s);
        int a=strlen(s);
        for(int i=0;i<a-1;i++) if(s[i]==s[i+1]) s[i]='@';
        for(int i=0;i<a;i++) if(s[i]>'@') printf("%c",s[i]);
        printf("\n");
    }
    return 0;
}