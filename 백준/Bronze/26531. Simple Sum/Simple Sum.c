#include<stdio.h>
int main(){
	int a,b,c;
	char q,w;
	scanf("%d %c %d %c %d",&a,&q,&b,&w,&c);
	printf(c==a+b?"YES":"NO");
	return 0;
}