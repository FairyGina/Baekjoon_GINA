#include <stdio.h>
#include<string.h>
#include<stdlib.h>
int main() {
    int t;
    scanf("%d",&t);
    for(int i=0;i<t;i++){
      char s[10],s1[4]="",s2[4]="";
      scanf("%s",s);
      if((s[0]=='P')&&(s[1]=='=')&&(s[2]=='N')&&(s[3]=='P')) printf("skipped\n");
      else{
        int j=0;
        for(j=1;j<strlen(s);j++)
          if(s[j]=='+') break;
        int p=j;
        for(int j=0;j<p;j++)
          s1[j]=s[j];
        for(int j=p+1,k=0;j<strlen(s);j++,k++)
          s2[k]=s[j];
        printf("%d\n",atoi(s1)+atoi(s2));
      }
    }
    return 0;
}