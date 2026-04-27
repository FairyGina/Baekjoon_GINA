#include<stdio.h>
int main(){
	int a,b;
	char s;
	while(1){
		int r=0;
		scanf("%d %c %d",&a,&s,&b);
		if((a==0)&&(b==0)) break;
		if(s!='W') r=a+b;
		else r=a-b;
		if(r<-200) printf("Not allowed\n");
		else printf("%d\n",r);
	}
	return 0;
}