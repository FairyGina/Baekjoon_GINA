#include <stdio.h>
int main(){
    int n,m,s[100]={0};
    scanf("%d %d",&n,&m);
    for(int i=0;i<m;i++){
        int a,b,c;
        scanf("%d %d %d",&a,&b,&c);
        for(int k=a-1;k<b;k++)
            s[k]=c;
    }
    for(int i=0;i<n;i++)
        printf("%d ",s[i]);
    return 0;
}