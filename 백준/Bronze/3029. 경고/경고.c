#include<stdio.h>
int c(){
	int h,m,s;
	scanf("%d:%d:%d",&h,&m,&s);
	return h*3600+m*60+s;
}
int main(){
	int h,m,a,b,r;
	a=c();
	b=c();
	r=a>b?86400-a+b:a<b?b-a:86400;
	h=r/3600;
	r%=3600;
	m=r/60;
	r%=60;
	printf("%02d:%02d:%02d",h,m,r);
	return 0;
}