#include <stdio.h>
int main() {
    int n,k,t,s[1000];
    scanf("%d %d",&n,&k);
    for(int i=0;i<n;i++)
      scanf("%d",&s[i]);
    for(int i=0;i<n-1;i++){
      for(int j=i+1;j<n;j++)
        if(s[i]<s[j])
          t=s[i],s[i]=s[j],s[j]=t;
    }
    printf("%d",s[k-1]);
    return 0;
}