#include <stdio.h>
int main() {
    int m,s,res=0;
    scanf("%d",&s);
    for(int i=1;i<8;i++){
      scanf("%d",&m);
      if(m>s) res++;
      else if(m<s) res--;
      s=m;
    }
    if(res==7) printf("ascending");
    else if(res==-7) printf("descending");
    else printf("mixed");
    return 0;
}