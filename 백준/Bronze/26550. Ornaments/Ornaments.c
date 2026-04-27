#include<stdio.h>
int main(){
	int t,n;
	scanf("%d",&t);
	while(t--){
		long long r=0;
		scanf("%d",&n);
		for(long long i=1;i<=n;i++) r+=i*(i+1)/2;
		printf("%lld\n",r);
	}
}