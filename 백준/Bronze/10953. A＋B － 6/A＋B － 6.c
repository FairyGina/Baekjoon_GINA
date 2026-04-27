#include <stdio.h>
#include<string.h>
int main() {
    int t;
    char s[4];
    scanf("%d",&t);
    for(int i=0;i<t;i++){
      scanf("%s",s);
      printf("%d\n",(s[0]-'0')+(s[2]-'0'));
    }
    return 0;
}