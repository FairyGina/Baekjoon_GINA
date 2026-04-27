#include <stdio.h>
#include<stdlib.h>
int main() {
    int wm[4];
    for(int i=0;i<4;i++){
      scanf("%d",&wm[i]);
    }
    for(int i=0;i<3;i++){
      for(int j=i+1;j<4;j++){
        if(wm[i]>wm[j]){
          int t=wm[i];
          wm[i]=wm[j];
          wm[j]=t;
        }
      }
    }
    int r=0,l=0;
    for(int i=3;i>=0;i--){
      if(l>r) r+=wm[i];
      else l+=wm[i];
    }
    printf("%d",abs(l-r));
    return 0;
}