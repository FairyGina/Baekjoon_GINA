#include<stdio.h>
#include<math.h>
int main(){
    double a,b;
    scanf("%lf %lf",&a,&b);
    a=b/(b-a);
    printf("%.0lf",ceil(a));
    return 0;
}
