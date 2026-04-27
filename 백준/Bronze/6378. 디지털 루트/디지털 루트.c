#include <stdio.h>
#include<string.h>
int r(int n){
    int res=0;
    while(1){
      if(n/10==0){
        res+=n%10;
        break;
      }
      res+=n%10;
      n/=10;
    }
    if(res>9)
      return r(res);
    else
      return printf("%d\n",res);
}
int main() {
    char n[1001];
    while(1){
      int res=0;
      scanf("%s",n);
      for(int i=0;i<strlen(n);i++){
        res+=n[i]-'0';
      }
      if(res==0) break;
      else if (res>9) r(res);
      else printf("%d\n",res);
    }
    return 0;
}