#include<stdio.h>
int main(){
	int i,n,k,r;
	scanf("%d%d",&n,&k);
	r=n;
	for(i=0;i<k;i++) n*=10,r+=n;
	printf("%d",r);
	return 0;
}