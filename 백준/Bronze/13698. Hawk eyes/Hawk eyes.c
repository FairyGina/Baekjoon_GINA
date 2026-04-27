#include<stdio.h>
#include<string.h>
char c[201];
int s=0,l=3;
void t(int a,int b){
    if(s==a) s=b;
    else if(s==b) s=a;
    if(l==a) l=b;
    else if(l==b) l=a;
}
int main(){
    scanf("%s",c);
    for(int i=0;i<strlen(c);i++){
        if(c[i]=='A') t(0,1);
        else if(c[i]=='B') t(0,2);
        else if(c[i]=='C') t(0,3);
        else if(c[i]=='D') t(1,2);
        else if(c[i]=='E') t(1,3);
        else t(2,3);
    }
    printf("%d\n%d",s+1,l+1);
    return 0;
}