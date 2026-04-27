#include <stdio.h>
int main(){
    char s[5];
    scanf("%s",s);
    if(s[0]=='N') printf("North London Collegiate School");
    else if(s[0]=='B') printf("Branksome Hall Asia");
    else if(s[0]=='K') printf("Korea International School");
    else printf("St. Johnsbury Academy");
    return 0;
}