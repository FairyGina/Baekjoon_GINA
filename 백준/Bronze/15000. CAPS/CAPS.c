#include <stdio.h>
#include<string.h>
int main() {
    char s[1000001];
    scanf("%s",s);
    for(int i=0;i<1000001;i++)
      if((s[i]>='a')&&(s[i]<='z'))
        printf("%c",s[i]-32);
      else break;
    return 0;
}