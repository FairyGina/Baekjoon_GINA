#include <stdio.h>
int main(){
    int t;
    scanf("%d",&t);
    while(t--){
        int n,m,res=0;
        scanf("%d %d",&n,&m);
        for(int b=1;b<n;b++){
            for(int a=1;a<b;a++){
                if((a*a+b*b+m)%(a*b)==0) res++;
            }
        }
        printf("%d\n",res);
    }
    return 0;
}