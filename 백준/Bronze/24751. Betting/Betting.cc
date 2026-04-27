#include <stdio.h>
int main() {
    float a;
    scanf("%f",&a);
    printf("%.10f\n%.10f",100/a,100/(100-a));
    return 0;
}