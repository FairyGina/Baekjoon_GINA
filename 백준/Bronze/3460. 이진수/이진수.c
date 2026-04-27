#include<stdio.h>
int main(){
    int t;
    scanf("%d",&t);
    while(t--){
        int n,i=0,s[21]={0};
        scanf("%d",&n);
        while(1){
            if(n<1) break;
            else{
                if(n%2!=0) s[i]=1;
                i++;
            }
            n/=2;
        }
        for(int j=0;j<i;j++) if(s[j]==1) printf("%d ",j);
    }
    return 0;
}