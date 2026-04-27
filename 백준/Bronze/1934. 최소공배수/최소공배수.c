#include <stdio.h>
int main(){
    int t;
    scanf("%d",&t);
    while(t--){
        int a,b,min,res=1;
        scanf("%d %d",&a,&b);
        if(a>b) min=b+1;
        else min=a+1;
        if(min==1) printf("%d\n",a*b);
        else{
            while(min--){
                if(min==1) break;
                if((a%min==0)&&(b%min==0)){
                   a/=min,b/=min;
                   res*=min;
                   if(a>b) min=b+1;
                   else min=a+1;
                }
            }
            printf("%d\n",res*a*b);
        }
    }
    return 0;
}