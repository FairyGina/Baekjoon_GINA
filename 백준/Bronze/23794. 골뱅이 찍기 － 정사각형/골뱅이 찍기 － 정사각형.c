#include <stdio.h>
int w(int n){
    for(int i=0;i<n+2;i++)
      printf("@");
    printf("\n");
}
int h(int n){
    printf("@");
    for(int i=0;i<n;i++)
      printf(" ");
    printf("@\n");
}
int main() {
    int n;
    scanf("%d",&n);
    w(n);
    for(int i=0;i<n;i++)
      h(n);
    w(n);
    return 0;
}