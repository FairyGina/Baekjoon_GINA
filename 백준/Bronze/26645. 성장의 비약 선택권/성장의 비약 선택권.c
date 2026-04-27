#include<stdio.h>
int main(){
	int n,a;
	scanf("%d",&n);
	if(n<206) a=1;
	else if(n<218) a=2;
	else if(n<229) a=3;
	else a=4;
	printf("%d",a);
	return 0;
}