#include <stdio.h>

int main(){
	int n,a,b,c;
	scanf("%d %d %d", &a,&b,&c);
	n = ((a + 1) * (b + 1)) / (c+1) - 1;
	printf("%d", n);
	return 0;
}