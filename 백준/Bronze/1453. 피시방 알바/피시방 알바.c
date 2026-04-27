#include <stdio.h>
int main() {
    int n,a,res=0,num[101]={0};
    scanf("%d",&n);
    for(int i=0;i<n;i++){
      scanf("%d",&a);
      if(num[a]==0) num[a]=1;
      else res++;
    }
    printf("%d",res);
    return 0;
}