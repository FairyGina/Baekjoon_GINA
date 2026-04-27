#include <stdio.h>
#include<string.h>
#include<stdlib.h>
int main(){
    char s[32];//입력 문자열
    char *sa[4];
    scanf("%[^\n]s",s);
    char *ps=strtok(s," ");
    int i=0;
    while(ps!=NULL){
        sa[i]=ps;
        i++;
        ps=strtok(NULL," ");
    }
    strcat(sa[0],sa[1]);
    strcat(sa[2],sa[3]);
    printf("%lld",atoll(sa[0])+atoll(sa[2]));
    return 0;
}