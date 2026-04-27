#include<stdio.h>
int main(){
	int a,r=5000;
	while(scanf("%d",&a)!=EOF){
		if(a==1) r-=500;
		else if(a==2) r-=800;
		else r-=1000;
	}
	printf("%d",r);
	return 0;
}