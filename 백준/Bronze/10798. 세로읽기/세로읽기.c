#include<stdio.h>
#include<string.h>
char s[5][16]={0,};
int main(){
    int i=0,j=0,max=0;
    for(int i=0;i<5;i++){
        scanf(" %s",s[i]);
        if(strlen(s[i])>max) max=strlen(s[i]);
    }
    while(1){
        if(s[i][j]!='\0') printf("%c",s[i][j]);
        i++;
        if(i>5){
            if(j==max-1) break;
            j++,i=0;
        }
    }
    return 0;
}