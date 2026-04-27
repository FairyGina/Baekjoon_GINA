#include<stdio.h>
int main(){
	int n,t,f=0,r=0;
	scanf("%d",&n);
	while(n--){
		scanf("%d",&t);
		if(t>=f) r++;
		f=t;
	}
	printf("%d",r);
	return 0;
}