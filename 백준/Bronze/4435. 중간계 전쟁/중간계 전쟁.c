#include <stdio.h>
int q(int *s,int c){
    int a,r=0;
    for(int j=0;j<c;j++){
        scanf("%d",&a);
        r+=a*s[j];
    }
    return r;
}
int main(){
    int t;
    scanf("%d",&t);
    for(int i=1;i<=t;i++){
        int res1=0,res2=0,g[6]={1,2,3,3,4,10},s[7]={1,2,2,2,3,5,10};
        res1=q(g,6);
        res2=q(s,7);
        if(res1>res2) printf("Battle %d: Good triumphs over Evil\n",i);
        else if(res1<res2) printf("Battle %d: Evil eradicates all trace of Good\n",i);
        else printf("Battle %d: No victor on this battle field\n",i);
    }
    return 0;
}