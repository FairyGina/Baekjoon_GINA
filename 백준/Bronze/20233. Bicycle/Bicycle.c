#include <stdio.h>
int main() {
    int a,x,b,y,t;
    scanf("%d %d %d %d %d",&a,&x,&b,&y,&t);
    if(t>45)
      printf("%d %d",a+(t-30)*x*21,b+(t-45)*y*21);
    else if(t>30)
      printf("%d %d",a+(t-30)*x*21,b);
    else
      printf("%d %d",a,b);
    return 0;
}