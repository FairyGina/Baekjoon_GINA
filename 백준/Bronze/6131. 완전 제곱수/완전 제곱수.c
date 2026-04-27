#include<stdio.h>
#include<math.h>
int main(){
	int n,res=0;
	scanf("%d",&n);
	for(int i=sqrt(n);i<501;i++){
		for(int j=1;j<i;j++){
			if(i*i-j*j==n) res++;
		}
	}
	printf("%d",res);
	return 0;
}