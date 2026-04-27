#include<stdio.h>
int main(){
	int t,n;
	scanf("%d",&t);
	while(t--){
		scanf("%d",&n);
		printf(n%2!=0?"%d is odd\n":"%d is even\n",n);
	}
}