#include <stdio.h>
#include<string.h>
int main() {
    int a,h,t;
    scanf("%d",&t);
    for(int i=0;i<t;i++){
      int h,max=0;
      char sc[21]="";
      scanf("%d",&a);
      for(int j=0;j<a;j++){
        char s[21]="";
        scanf("%s %d",s,&h);
        if(h>max){
          max=h;
          strcpy(sc,s);
          }
      }
      printf("%s\n",sc);     
    }
    return 0;
} 