#include<stdio.h>
int main(){
	int n,k,i,c[11]={0};
	scanf("%d %d",&n,&k);
	for(i=1;i<=n;i++) scanf("%d",&c[i]);
	for(i=n;i>0;i--){
		if(k>=c[i]) c[0]+=k/c[i],k%=c[i];
		else continue;
	}
	printf("%d",c[0]);
	return 0;
}