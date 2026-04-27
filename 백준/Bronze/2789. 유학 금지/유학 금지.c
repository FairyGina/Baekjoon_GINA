#include <stdio.h>
#include<string.h>
int main() {
    char s[101],c[10]="CAMBRIDGE";
    scanf("%s",s);
    for(int i=0;i<strlen(s);i++){
      for(int j=0;j<10;j++)
        if(s[i]==c[j]){
          s[i]='0';
          break;
        }
    }
    for(int i=0;i<strlen(s);i++)
      if(s[i]!='0') printf("%c",s[i]);
    return 0;
}