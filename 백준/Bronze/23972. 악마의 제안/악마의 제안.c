#include<stdio.h>
#include<math.h>
int main() {
	long long n,k,x;
	scanf("%lld %lld",&n,&k);
	if(k!=1){
		x=n*k/(k-1);
		if(n*k%(k-1)!=0) x++;
		printf("%lld",x);
	}
	else printf("-1");
	return 0;
}