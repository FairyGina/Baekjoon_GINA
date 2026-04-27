#include <stdio.h>
int main() {
    int t;
    scanf("%d",&t);
    for(int i=0;i<t;i++){
      int n,res=0,p[101]={0};
      scanf("%d",&n);
      for(int j=2;j<=n;j++){
        for(int k=1;j*k<=n;k++){
          if(p[j*k]==0) p[j*k]=1;
          else p[j*k]=0;
        }
      }
      for(int j=1;j<=n;j++)
        if(p[j]==0) res++;
      printf("%d\n",res);
    }
    return 0;
}