#include <stdio.h>
#include<string.h>
int main() {
    int r=0;
    char s[101];
    scanf("%s",s);
    for(int i=0;i<strlen(s);i++)
      if(s[i]==',') r++;
    printf("%d",r+1);
    return 0;
}