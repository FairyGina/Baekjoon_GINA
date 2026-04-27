#include<stdio.h>
#include<string.h>
int main(){
    int n;
    scanf("%d",&n);
    while(n--){
        char s[21];
        scanf("%s",s);
        if((strlen(s)>5)&&(strlen(s)<10)) printf("yes\n");
        else printf("no\n");
    }
    return 0;
}