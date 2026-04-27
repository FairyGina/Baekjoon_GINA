#include <stdio.h>
#include<string.h>
int main() {
    int n;
    char r[21];
    scanf("%d",&n);
    for(int i=0;i<n;i++){
      scanf("%s",r);
      for(int j=0;j<sizeof(r);j++)
        if(r[j]>='A'&&r[j]<='Z')
          r[j]+=32;
    printf("%s\n",r);
    }
    return 0;
}