#include<stdio.h>
int main(){
	int i,t,s,a=0,b=0,c=0;
	scanf("%d",&t);
	i=t;
	if(t%2==0) t--;
	while(i--){
		scanf("%d",&s);
		s==1?a++:s==0?b++:c++;
	}
	if(b>t/2) printf("INVALID");
	else if(a>c) printf("APPROVED");
	else printf("REJECTED");
	return 0;
}