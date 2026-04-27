#include <stdio.h>
int main() {
    char a[10001]="";
    int jo=0,io=0;
    scanf("%s",a);
    for(int i=0;i<10001;i++){
      if((a[i]=='J')&&(a[i+1]=='O')&&(a[i+2]=='I')) jo++;
      if((a[i]=='I')&&(a[i+1]=='O')&&(a[i+2]=='I')) io++;
    }
    printf("%d\n%d",jo,io);
    return 0;
}