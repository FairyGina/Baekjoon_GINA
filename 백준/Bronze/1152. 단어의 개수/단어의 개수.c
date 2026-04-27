#include <stdio.h>
#include<string.h>
int main() {
    char s[1000001];
    int c=0,res=0;
    gets(s);
    for(int i=0;i<strlen(s);i++){
      if(s[i]==' ') c=0;
      else if(c==0) res++,c++;
    }
    printf("%d",res);
    return 0;
}