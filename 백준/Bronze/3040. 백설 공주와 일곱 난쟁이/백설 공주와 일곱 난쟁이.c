#include <stdio.h>
int main() {
    int n[9],res=0,ch=0,q=0;
    for(int i=0;i<9;i++){
      scanf("%d",&n[i]);
      res+=n[i];
    }
    for(int i=0;i<8;i++){
      for(int j=i+1;j<9;j++){
        if(res-n[i]-n[j]==100){
          n[i]=0,n[j]=0,q++;
          break;
        }
      }
      if(q>0) break;
    }
    for(int i=0;i<8;i++){
      for(int j=i+1;j<9;j++)
        if(n[i]>n[j])
          ch=n[j],n[j]=n[i],n[i]=ch;
    }
    for(int i=0;i<9;i++)
      if(n[i]>0)
        printf("%d\n",n[i]);
    return 0;
}