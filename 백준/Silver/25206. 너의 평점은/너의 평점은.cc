#include <stdio.h>
#include<string.h>
#include<stdlib.h>
float sc(char *p){
    float s;
    if(p[0]=='A'){
        if(p[1]=='+') s=4.5;
        else s=4.0;
    }
    else if(p[0]=='B'){
        if(p[1]=='+') s=3.5;
        else s=3.0;
    }
    else if(p[0]=='C'){
        if(p[1]=='+') s=2.5;
        else s=2.0;
    }
    else if(p[0]=='D'){
        if(p[1]=='+') s=1.5;
        else s=1.0;
    }
    else s=0.0;
    return s;
}
int main(){
    int n=20;
    float res=0,cr=0;
    while(n--){
        char s[58]="";
        scanf("%[^\n]s",s);
        char *ptr=strtok(s," ");
        getchar();
        int i=0;
        float al,as;
        while(ptr!=NULL){
            ptr=strtok(NULL," ");
            if(i==0) as=atof(ptr);
            else if(i==1){
                if(ptr[0]=='P') break;
                else{
                al=sc(ptr);
                cr+=as;
                res+=al*as;
                }
            }
            i++;
        }
    }
    printf("%.7f",res/cr);
    return 0;
}