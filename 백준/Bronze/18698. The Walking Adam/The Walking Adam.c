#include <stdio.h>
#include<string.h>
int main() {
    int t,res=0;
    char w[101];
    scanf("%d",&t);
    for(int i=0;i<t;i++){
      scanf("%s",w);
      for(int j=0;j<strlen(w);j++){
        if(w[j]=='U') res++;
        else break;
      }
      printf("%d\n",res);
      res=0;
    }
    return 0;
}