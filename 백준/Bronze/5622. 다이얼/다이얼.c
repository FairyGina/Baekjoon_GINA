#include <stdio.h>
#include<string.h>
int main(){
    int res=0, ap[26]={3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
    char a[16]="";
    scanf("%s",a);
    for(int i=0;i<strlen(a);i++)
        res+=ap[a[i]-65];
    printf("%d",res);
    return 0;
}