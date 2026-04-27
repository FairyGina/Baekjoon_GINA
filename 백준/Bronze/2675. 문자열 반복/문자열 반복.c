#include <stdio.h>
#include<string.h>
int main() {
    int t,n;
    char s[21];
    scanf("%d",&t);
    for(int i=0;i<t;i++){
      scanf("%d %s",&n,s);
      for(int j=0;j<strlen(s);j++)
        for(int k=0;k<n;k++)
          printf("%c",s[j]);
      printf("\n");
    }
    return 0;
}