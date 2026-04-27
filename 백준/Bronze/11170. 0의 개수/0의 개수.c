#include <stdio.h>
int zero(int j){
  int r=0;
  do{
    if(j%10==0) r++;
    j/=10;
  }while(j/=10!=0);
  return r;
}
int main() {
    int t;
    scanf("%d",&t);
    for(int i=0;i<t;i++){
      int n,m,res=0;
      scanf("%d %d",&n,&m);
      for(int j=n;j<=m;j++)
        res+=zero(j);
      printf("%d\n",res);
    }
    return 0;
}