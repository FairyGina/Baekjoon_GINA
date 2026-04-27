#include <stdio.h>
int main() {
    while(1){
      char s[256];
      int res=0;
      gets(s);
      if(s[0]=='#') break;
      for(int i=0;s[i]!='\0';i++){
        if((s[i]=='a')||(s[i]=='e')||(s[i]=='i')||(s[i]=='o')||(s[i]=='u')||(s[i]=='A')||(s[i]=='E')||(s[i]=='I')||(s[i]=='O')||(s[i]=='U')) res++;
      }
      printf("%d\n",res);
    }
    return 0;
}