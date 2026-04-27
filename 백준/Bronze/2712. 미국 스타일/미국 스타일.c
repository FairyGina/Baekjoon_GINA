#include <stdio.h>
#include<string.h>
int main(){
    int t;
    scanf("%d",&t);
    while(t--){
        char c[3];
        double n;
        scanf("%lf %s",&n,c);
        if(c[0]=='l'){
            c[1]=='b'?printf("%.4lf kg\n",n*0.4536):printf("%0.4lf g\n",n*0.2642);
        }
        else c[0]=='k'?printf("%.4lf lb\n",n*2.2046):printf("%.4lf l\n",n*3.7854);
    }
    return 0;
}