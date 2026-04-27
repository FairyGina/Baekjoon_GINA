#include <stdio.h>
int main(){
    int r,res=0,n[5];
    for(int i=0;i<5;i++){
        scanf("%d",&r);
        res+=r;
        int j=0;
        for(;j<i;j++){
            if(r<=n[j]){
                for(int k=i;k>j;k--)
                    n[k]=n[k-1];
                n[j]=r;
                break;
            }
        }
        if(j==i) n[j]=r;
    }
    printf("%d\n%d",res/5,n[2]);
    return 0;
}