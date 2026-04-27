#include<stdio.h>
#include<string.h>
int main(){
    int t;
    scanf("%d",&t);
    while(t--){
        char s[101];
        int i,is,js;
        scanf("%s %d %d",s,&is,&js);
        for(i=0;i<is;i++) printf("%c",s[i]);
        for(i=js;i<strlen(s);i++) printf("%c",s[i]);
        printf("\n");
    }
    return 0;
}