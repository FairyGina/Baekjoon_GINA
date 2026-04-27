#include<stdio.h>
int main(){
	double w,l,h,s,m;
	scanf("%lf %lf %lf",&w,&l,&h);
	if(w<l) s=w,m=l;
	else s=l,m=w;
	printf(((s>=2*h)&&(s*2>=m))?"good":"bad");
}