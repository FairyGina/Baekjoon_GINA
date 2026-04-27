#include <stdio.h>
#include<string.h>
int main() {
    char s[101];
    int p=1;
    scanf("%s",s);
    for(int i=0,j=strlen(s)-1;i<strlen(s)/2;i++,j--){
      if(s[i]!=s[j]){
        p=0;
        break;
      }
    }
    printf("%d",p);
    return 0;
}