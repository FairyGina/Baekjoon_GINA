#include <stdio.h>
int main(){
    int t,f=5;
    scanf("%d",&t);
    while(f--){
        int i,j,k;
        for(i=0;i<t;i++){
            if(f%2!=0){
                for(k=0;k<t*5;k++) printf("@");
                printf("\n");
            }
            else{
                for(k=0;k<t;k++) printf("@");
                for(k=0;k<t*3;k++) printf(" ");
                for(k=0;k<t;k++) printf("@");
                printf("\n");
            }
        }
    }
    return 0;
}