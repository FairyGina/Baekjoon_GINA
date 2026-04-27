#include <stdio.h>
#include<string.h>
int main() {
    int n;
    char s[101];
    scanf("%d %s",&n,s);
    for(int i=0;i<n-2;i++)
      if((s[i]=='j')&&(s[i+1]=='o')&&(s[i+2]=='i')) s[i]='J',s[i+1]='O',s[i+2]='I';
    printf("%s",s);
    return 0;
}