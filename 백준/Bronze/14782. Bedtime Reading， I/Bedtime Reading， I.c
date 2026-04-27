#include<stdio.h>
int main(){
	int n,r=0;
	scanf("%d",&n);
	for(int i=1;i<=n/2;i++) if(n%i==0) r+=i;
	printf("%d",r+n);
	return 0;
}