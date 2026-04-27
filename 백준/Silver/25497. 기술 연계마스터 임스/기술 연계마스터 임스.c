#include<stdio.h>
#include<string.h>
#include<stdbool.h>
int main(){
    int n,ts=-1,tl=-1,res=0;
    char ip[200001];
    scanf("%d",&n);
    scanf("%s",ip);
    for(int i=0;i<n;i++){
        if((ip[i]>'0')&&(ip[i]<':')) res++;
        else{
            if(ip[i]=='L') tl++;
            else if(ip[i]=='S') ts++;
            else if(ip[i]=='R'){
                if(tl>-1){
                    res++,tl--;
                    if(tl<-1) tl=-1;
                }
                else i=n;
            }
            else{
                if(ts>-1){
                    res++,ts--;
                    if(ts<-1) ts=-1;
                }
                else i=n;
            }
        }
    }
    printf("%d",res);
    return 0;
}