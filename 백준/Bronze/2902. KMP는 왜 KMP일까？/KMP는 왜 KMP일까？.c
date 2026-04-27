#include <stdio.h>
#include<string.h>
int main() {
    char s[101];
    scanf("%s",s);
    printf("%c",s[0]);
    for(int i=0;i<strlen(s);i++)
      if(s[i]=='-') printf("%c",s[i+1]);
    return 0;
}