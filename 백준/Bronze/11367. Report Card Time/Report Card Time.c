#include <stdio.h>
int main(){
    int t;
    scanf("%d",&t);
    while(t--){
        char s[11];
        int n;
        scanf("%s %d",s,&n);
        printf("%s ",s);
        switch(n/10){
            case 10:
                printf("A");
                break;
            case 9:
                printf("A");
                break;
            case 8:
                printf("B");
                break;
            case 7:
                printf("C");
                break;
            case 6:
                printf("D");
                break;
            default:
                printf("F");
                break;
        }
        if(((n%10>6)&&(n>59))||(n==100)) printf("+");
        printf("\n");
    }
    return 0;
}