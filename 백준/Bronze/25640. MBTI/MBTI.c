#include <stdio.h>
int main() {
    char m[5],f[5];
    int res=0,n;
    scanf("%s %d",m,&n);
    for(int i=0;i<n;i++){
      int h=1;
      scanf("%s",f);
      for(int j=0;j<4;j++){
        if(m[j]!=f[j]){
          h=0;
          break;
        }
      }
      res+=h;
    }
    printf("%d",res);
    return 0;
}