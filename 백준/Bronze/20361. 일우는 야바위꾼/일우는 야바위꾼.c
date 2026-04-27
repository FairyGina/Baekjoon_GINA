#include<stdio.h>
int main(){
	int n,x,k,a,b;
	scanf("%d %d %d",&n,&x,&k);
	while(k--){
		scanf("%d %d",&a,&b);
		if((a==x)||(b==x)) x=x==a?b:a;
	}
	printf("%d\n",x);
	return 0;
}