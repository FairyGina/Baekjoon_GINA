#include <stdio.h>
int main(){
    int a,b;
    while(1){
        scanf("%d %d",&a,&b);
        if(a==0) break;
        else{
            printf("%d\n",a-(b-a));
        }
    }
    return 0;
}