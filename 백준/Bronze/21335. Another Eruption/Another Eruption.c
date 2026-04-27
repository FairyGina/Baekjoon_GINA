#include <stdio.h>
#include<math.h>
int main() {
    double a,r,p=3.14159265359;
    scanf("%lf",&a);
    r=sqrt(a/p);
    printf("%.9lf",2*r*p);
    return 0;
}