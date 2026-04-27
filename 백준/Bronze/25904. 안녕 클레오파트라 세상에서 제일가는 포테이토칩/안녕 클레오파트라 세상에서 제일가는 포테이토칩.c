#include<stdio.h>
int main(){
	int i,n,x,s[100];
	scanf("%d %d",&n,&x);
	for(i=0;i<n;i++) scanf("%d",&s[i]);
	i=0;
	while(1){
		if(x>s[i]) break;
		x++,i++;
		if(i==n) i=0;
	}
	printf("%d",i+1);
	return 0;
}