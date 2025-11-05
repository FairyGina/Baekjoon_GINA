#include <stdio.h>
#include<string.h>
int main(){
    int n,res=0;
    scanf("%d",&n);
    while(n--){
        char s[101]="";
        int i,alpha[26]={0};
        scanf("%s",s);
        alpha[s[0]-'a']++;
        for(i=1;i<strlen(s);i++){
            if(s[i-1]!=s[i]) alpha[s[i]-'a']++;
            if(alpha[s[i]-'a']>1) break;
        }
        if(i==strlen(s)) res++;
    }
    printf("%d",res);
    return 0;
}