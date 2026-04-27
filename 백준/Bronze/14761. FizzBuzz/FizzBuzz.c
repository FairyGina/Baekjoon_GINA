#include<stdio.h>
int main(){
	int x,y,n;
	scanf("%d %d %d",&x,&y,&n);
	for(int i=1;i<=n;i++){
		if(i%x==0) printf("Fizz");
		if(i%y==0) printf("Buzz");
		else if(i%x!=0) printf("%d",i);
		printf("\n");
	}
	return 0;
}