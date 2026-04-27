#include<stdio.h>
int main(){
	int a,t,i,n=0;
	scanf("%d",&t);
	for(i=1;i<=t;i++) n+=i;
	t--;
	while(t--){
		scanf("%d",&a);
		n-=a;
	}
	printf("%d",n);
	return 0;
}