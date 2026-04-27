#include <stdio.h>
int main() {
    int v,ares=0,bres=0;
    char s[15];
    scanf("%d",&v);
    scanf("%s",s);
    for(int i=0;i<v;i++){
      if(s[i]=='A') ares++;
      else if(s[i]=='B') bres++;
    }
    if(ares>bres) printf("A");
    else if(ares<bres) printf("B");
    else printf("Tie");
    return 0;
}