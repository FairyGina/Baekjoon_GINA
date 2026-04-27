#include <stdio.h>
void a(int n){
    int i,j;
    for(i=0;i<n;i++){
        for(j=0;j<5*n;j++) printf("@");
        printf("\n");
    }   
}
void b(int n){
    int i,j;
    for(i=0;i<n;i++){
        for(j=0;j<n;j++) printf("@");
        for(j=0;j<3*n;j++) printf(" ");
        for(j=0;j<n;j++) printf("@");
        printf("\n");
    }   
}
int main(){
    int n;
    scanf("%d",&n);
    a(n);
    for(int i=0;i<3;i++) b(n);
    a(n);
    return 0;
}