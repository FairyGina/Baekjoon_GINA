#include <stdio.h>
int main(){
    int n,m,b[100];
    scanf("%d %d",&n,&m);
    for(int i=1;i<=n;i++) b[i]=i;
    while(m--){
        int i,j,k,c,a,ch[100];
        scanf("%d %d %d",&i,&j,&k);
        for(c=i,a=1;c<k;c++,a++)
            ch[a]=b[c];
        for(c=k,a=i;c<=j;c++,a++)
            b[a]=b[c];
        for(c=k-i,a=j;c>0;c--,a--)
            b[a]=ch[c];
    }
    for(int i=1;i<=n;i++) printf("%d ",b[i]);
    return 0;
}