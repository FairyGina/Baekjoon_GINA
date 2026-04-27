#include <stdio.h>
#include<string.h>
int main() {
    char s[101];
    int a[26]={0};
    scanf("%s",s);
    for(int i=0;i<strlen(s);i++)
      a[s[i]-97]++;
    for(int i=0;i<26;i++)
      printf("%d ",a[i]);
    return 0;
}