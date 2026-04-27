#include<stdio.h>
#include<string.h>
int main(){
    char s[101];
    int i,c[5]={0};
    scanf("%s",s);
    for(i=0;i<strlen(s);i++){
        if(s[i]=='M') c[0]++;
        else if(s[i]=='O') c[1]++;
        else if(s[i]=='B') c[2]++;
        else if(s[i]=='I') c[3]++;
        else if(s[i]=='S') c[4]++;
    }
    for(i=0;i<5;i++) if(c[i]==0) break;
    printf("%s",i==5?"YES":"NO");
    return 0;
}