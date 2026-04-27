#include <stdio.h>
int in(int *a){
  for(int i=0;i<9;i++)
    scanf("%d",&a[i]);
  return *a;
}
int main() {
    int w=0,ra=0,rb=0,a[9],b[9];
    in(a);
    in(b);
    for(int i=0;i<9;i++){
      ra+=a[i];
      if(ra>rb) w=1;
      rb+=b[i];
      if((ra<rb)&&(w>0)) w=2;
    }
    if(w==2) printf("Yes");
    else printf("No");
    return 0;
}