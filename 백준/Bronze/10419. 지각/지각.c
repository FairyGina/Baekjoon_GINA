#include <stdio.h>
#include<math.h>
int main(){
    int t;
    scanf("%d",&t);
    while(t--){
        int d,max=0;
        scanf("%d",&d);
        for(int i=1;i<=d;i++){
            if(i*(i+1)<=d) max=i;
            else break;
        }
        printf("%d\n",max);
    }
    return 0;
}