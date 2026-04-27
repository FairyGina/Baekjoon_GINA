#include<stdio.h>
int main(){
	int n,m,a;
	scanf("%d %d",&n,&m);
	n--;
	while(n--){
		scanf("%d",&a);
		if(a>m){
			printf("N");
			break;
		}
	}
	if(n==-1)printf("S");
	return 0;
}