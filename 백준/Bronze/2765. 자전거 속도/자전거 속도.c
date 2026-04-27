#include<stdio.h>
int main(){
    int i=0;
    while(1){
    double p,m,h;
    int r;
    scanf("%lf %d %lf",&p,&r,&h);
    if(r==0) break;
    m=(p*3.1415927*r/63360),i++;
    printf("Trip #%d: %.2lf %.2lf\n",i,m,m/h*3600);
    }
    return 0;
}