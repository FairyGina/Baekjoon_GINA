#include<stdio.h>
int main(){
  int n,p;
  scanf("%d %d",&n,&p);
  int min=p;
  if(n>4) min=p-500;
  if((n>9)&&(min>p*9/10)) min=p*9/10;
  if((n>14)&&(min>p-2000)) min=p-2000;
  if((n>19)&&(min>p*3/4)) min=p*3/4;
  if(min<0) min=0;
  printf("%d",min);
  return 0;
}