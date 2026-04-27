#include<stdio.h>
#include<string.h>
int main(){
    char a[101],b[101],c;
    scanf("%s %c %s",a,&c,b);
    int as=strlen(a),bs=strlen(b);
    if(c=='+'){
        int m,n;
        (as>bs)?(m=as,n=bs):(m=bs,n=as);
        (as==bs)?printf("2"):printf("1");
        for(int i=0;i<m-1;i++) (i==m-n-1)?printf("1"):printf("0");
    }
    else{
        printf("1");
        for(int i=0;i<as+bs-2;i++) printf("0");
    }
    return 0;
}