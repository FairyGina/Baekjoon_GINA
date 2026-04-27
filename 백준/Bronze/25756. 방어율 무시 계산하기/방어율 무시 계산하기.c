#include<stdio.h>
int main(){
	int n;
	double a,v=0;
	scanf("%d",&n);
	while(n--){
		scanf("%lf",&a);
		v=(1-(1-v/100)*(1-a/100))*100;
		printf("%.6lf\n",v);
	}
	return 0;
}