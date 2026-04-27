#include <stdio.h>
int main() {
    int n,m,a,s[100000]={0};
    scanf("%d %d",&n,&m);
    for(int i=0;i<2*m;i++){
      scanf("%d",&a);
      s[a]++;
    }
    for(int i=1;i<=n;i++)
      printf("%d\n",s[i]);
    return 0;
}