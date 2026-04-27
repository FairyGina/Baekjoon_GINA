#include<stdio.h>
#include<math.h>
int main(){
	int t,d,n,s,p;
	scanf("%d",&t);
	while(t--){
		scanf("%d %d %d %d",&d,&n,&s,&p);
		printf(d+n*p>n*s?"do not parallelize\n":d+n*p<n*s?"parallelize\n":"does not matter\n");
	}
	return 0;
}