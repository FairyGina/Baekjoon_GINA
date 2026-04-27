#include <stdio.h>
int main() {
    int t,d1,d2,d3;
    scanf("%d",&t);
    printf("Gnomes:\n");
    for(int i=0;i<t;i++){
      scanf("%d %d %d",&d1,&d2,&d3);
      if(((d1<d2)&&(d2<d3))||((d1>d2)&&(d2>d3))) printf("Ordered\n");
      else printf("Unordered\n");
    }
    return 0;
}