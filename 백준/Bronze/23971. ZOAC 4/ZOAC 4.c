#include<stdio.h>
#include<math.h>
int a(double a,double b){
	double r;
	return ceil(a/(b+1));
}
int main(){
	int h,w,n,m;
	scanf("%d %d %d %d",&h,&w,&n,&m);
	printf("%d",a(h,n)*a(w,m));
	return 0;
}