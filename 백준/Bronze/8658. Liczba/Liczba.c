#include<stdio.h>
int main(){
    int n,q,w;
    scanf("%d",&n);
    for(int i=2;i<n;i++) if(n%i){q=i; break;}
    for(int i=n-1;i>1;i--) if(n%i){w=i; break;}
    printf("%d %d",q,w);
    return 0;
}
