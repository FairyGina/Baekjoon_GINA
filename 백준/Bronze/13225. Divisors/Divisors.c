#include<stdio.h>
int main(){
	int n,a;
	scanf("%d",&n);
	while(n--){
		int r=0;
		scanf("%d",&a);
		for(int i=1;i<a/2+1;i++) if(a%i==0) r++;
		printf("%d %d\n",a,r+1);
	}
	return 0;
}