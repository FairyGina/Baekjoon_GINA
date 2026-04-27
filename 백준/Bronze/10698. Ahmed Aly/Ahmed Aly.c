#include<stdio.h>
int main(){
	int t,a,b,c;
	char q,w;
	scanf("%d",&t);
	for(int i=1;i<=t;i++){
		scanf("%d %c %d %c %d",&a,&q,&b,&w,&c);
		printf("Case %d: ",i);
		q=='+'?printf(c==a+b?"YES\n":"NO\n"):printf(c==a-b?"YES\n":"NO\n");
	}
	return 0;
}