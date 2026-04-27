#include <stdio.h>
#include<string.h>
int main() {
    while(1){
      char s[6];
      int p=0;
      scanf("%s",s);
      if(s[0]=='0') break;
      for(int i=0,j=strlen(s)-1;i<strlen(s)/2;i++,j--){
        if(s[i]!=s[j]){
          p++;
          break;
        }
      }
      if(p==0) printf("yes\n");
      else printf("no\n");
    }
    return 0;
}