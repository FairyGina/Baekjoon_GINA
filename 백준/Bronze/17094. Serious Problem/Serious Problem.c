#include <stdio.h>
int main() {
    char s[100001];
    int slen,res2=0,rese=0;
    scanf("%d %s",&slen,s);
    for(int i=0;i<slen;i++){
      if(s[i]=='2') res2++;
      else if(s[i]=='e') rese++;
    }
    if(res2>rese) printf("2");
    else if(res2<rese) printf("e");
    else printf("yee");
    return 0;
}