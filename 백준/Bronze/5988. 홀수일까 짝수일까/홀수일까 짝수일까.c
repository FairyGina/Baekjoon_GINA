#include <stdio.h>
int main() {
    int t;
    scanf("%d",&t);
    for(int i=0;i<t;i++){
      char n[62];
      scanf("%s",n);
      if ((n[strlen(n)-1]-'0')%2!=0) printf("odd\n");
      else printf("even\n");
    }
    return 0;
}