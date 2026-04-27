#include<stdio.h>
int main(){
	int n,a,m=0;
	scanf("%d",&n);
	for(int i=n;i>0;i--){
		scanf("%d",&a);
		if(m<a-i) m=a-i;
	}
	printf("%d",m);
	return 0;
}