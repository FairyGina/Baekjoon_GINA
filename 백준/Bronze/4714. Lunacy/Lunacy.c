#include <stdio.h>
int main() {
    while(1){
    float m;
    scanf("%f",&m);
    if(m==-1.0) break;
    printf("Objects weighing %.2f on Earth will weigh %.2f on the moon.\n",m,m*0.167);
    }
    return 0;
}