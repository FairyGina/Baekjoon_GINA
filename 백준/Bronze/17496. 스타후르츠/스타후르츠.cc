#include <stdio.h>

int main(){
	unsigned int n, t, c, p, i, j, g=0;

	scanf("%d %d %d %d", &n, &t, &c, &p);
	
	g = ((n-1)/t)*c*p;

	printf("%d", g);

	return 0;
}