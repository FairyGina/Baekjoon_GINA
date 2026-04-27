#include <stdio.h>
#include<string.h>
int main() {
    int x,l;
    char h[101];
    scanf("%d",&x);
    for(int i=1;i<=x;i++){
      scanf("%d %s",&l,h);
      int r=l;
      for(int j=0;j<strlen(h);j++){
        if(h[j]=='c') r++;
        else r--;
        if(r==0) break;
      }
      printf("Data Set %d:\n%d\n\n",i,r);
    }
    return 0;
}