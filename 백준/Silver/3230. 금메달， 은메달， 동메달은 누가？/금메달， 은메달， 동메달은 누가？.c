#include <stdio.h>
int main() {
    int n,m,i,j,answer,a[101]={0},b[101]={0};
    scanf("%d %d",&n,&m);
    for(i=1;i<=n;i++){
      scanf("%d",&answer);
      for(j=1;j<=i;j++)
        if(answer<=a[j])
          a[j]++;
      a[i]=answer;
    }
    for(i=1;i<=m;i++)
      for(j=1;j<=n;j++)
        if(i==a[j])
          b[i]=j;
    for(i=1;i<=n;i++)
      a[i]=0;
    for(i=m;i>0;i--){
      scanf("%d",&answer);
      for(j=1;j<=n;j++)
        if(answer<=a[j])
          a[j]++;
      a[b[i]]=answer;
    }
  for(i=1;i<4;i++)
    for(int j=1;j<=n;j++)
      if(i==a[j])
        printf("%d\n",j);
    return 0;
}