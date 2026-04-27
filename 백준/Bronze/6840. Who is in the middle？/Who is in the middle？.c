#include<stdio.h>
int main(){
	int a,r=0,x=0,n=100;
	for(int i=0;i<3;i++){
		scanf("%d",&a);
		if(a>x) x=a;
		if(a<n) n=a;
		r+=a;
	}
	printf("%d",r-x-n);
	return 0;
}