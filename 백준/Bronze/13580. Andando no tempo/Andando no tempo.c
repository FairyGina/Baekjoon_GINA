#include<stdio.h>
int main(){
	int a,b,c;
	char s='N';
	scanf("%d %d %d",&a,&b,&c);
	if((a==b)||(b==c)||(a==c)) s='S';
	else if((a+b==c)||(b+c==a)||(a+c)==b) s='S';
	else if((a-b==c)||(b-c==a)||(a-c)==b) s='S';
	printf("%c",s);
	return 0;
}