#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main() {
	int n, res = 0;
	char c[6];
	scanf("%d",&n);
	for (int i = 0; i < n; i++) {
	    char d[4]="";
		scanf("%s", c);
		for (int j = 2; j < strlen(c); j++)
			d[j - 2] = c[j];
		if (atoi(d) <= 90) res++;
	}
	printf("%d", res);
	return 0;
}