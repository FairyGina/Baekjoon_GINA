#include <stdio.h>
#include<string.h>
int main() {
    int t;
    scanf("%d",&t);
    getchar();
    for(int i=0;i<t;i++){
      char s[31];
      scanf("%[^\n]s",s);
      if((s[0]>96)&&(s[0]<123)) s[0]-=32;
      printf("%s\n",s);
      getchar();
    }
    return 0;
}