#include <stdio.h>
int main() {
    int t,a,b,c,d;
    scanf("%d",&t);
    for(int i=0;i<t;i++){
      char e[5]="FAIL";
      scanf("%d %d %d %d",&a,&b,&c,&d);
      if((b>10)&&(c>7))
        if((d>11)&&(b+c+d>54))
          e[0]='P',e[1]='A',e[2]='S',e[3]='S';
      printf("%d %d %s\n",a,b+c+d,e);
    }
    return 0;
}