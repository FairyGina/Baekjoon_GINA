#include<stdio.h>
#include<string.h>
#define m(x,a) if(x<a) x=a;
int main(){
	int t,a,b,c;
	char s[12]="";
	scanf("%d",&t);
	for(int i=1;i<=t;i++){
		int x=0;
		scanf("%d %d %d",&a,&b,&c);
		m(x,a);
		m(x,b);
		m(x,c);
		if(a+b+c-2*x>0){
			if((a==b)&&(b==c)) printf("Case #%d: equilateral\n",i);
			else if((a==b)||(b==c)) printf("Case #%d: isosceles\n",i);
			else printf("Case #%d: scalene\n",i);
		}
		else printf("Case #%d: invalid!\n",i);
	}
	return 0;
}