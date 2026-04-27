#include<stdio.h>
#include<string.h>
int main(){
    int n;
    scanf("%d",&n);
    while(n--){
        char s[1001];
        scanf("%s",s);
        if(s[strlen(s)/2-1]!=s[strlen(s)/2]) printf("Do-it-Not\n");
        else printf("Do-it\n");
    }
    return 0;
}