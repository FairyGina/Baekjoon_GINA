#include <stdio.h>
#include<string.h>
int main() {
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
    char s1[21]="",s2[21]="";
      scanf("%s %s",s1,s2);
      printf("Distances: ");
      for(int j=0;j<strlen(s1);j++){
        int res=s2[j]-s1[j];
        if(res<0) res+=26;
        printf("%d ",res);
      }
      printf("\n");
    }
    return 0;
}