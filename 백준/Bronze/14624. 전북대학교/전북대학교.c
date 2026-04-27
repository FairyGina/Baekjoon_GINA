#include <stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    if(n%2!=0){
        for(int i=0;i<n;i++) printf("*");
        printf("\n");
        for(int i=0;i<n/2+1;i++){
            for(int j=i;j<n/2;j++) printf(" ");
            printf("*");
            for(int j=0;j<2*i-1;j++) printf(" ");
            if(i>0) printf("*\n");
            else printf("\n");
        }
    }
    else printf("I LOVE CBNU");
    return 0;
}