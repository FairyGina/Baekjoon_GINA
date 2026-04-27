#include <stdio.h>
#include<string.h>
int main() {
    while(1){
      char s[81],a[81]="";
      scanf("%[^\n]s",s);
      if((s[0]=='*')&&(s[1]=='*')&&(s[2]=='*')) break;
      for(int i=strlen(s)-1,j=0;i>-1;i--,j++)
        a[j]=s[i];
      getchar();
      printf("%s\n",a);
    }
    return 0;
}