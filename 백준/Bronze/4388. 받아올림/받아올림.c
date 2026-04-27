#include<stdio.h>
#include<stdbool.h>
int main(){
    while(1){
        long a,b,res=0;
        bool l=false;
        scanf("%ld %ld",&a,&b);
        if((a==0)&&(b==0)) break;
        while(1){
            if((a%10)+(b%10)+l>9){
                res++,l=true;
            }
            a/=10,b/=10;
            if((a==0)&&(b==0)) break;
        }
        printf("%ld\n",res);
    }
    return 0;
}