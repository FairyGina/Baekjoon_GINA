#include<stdio.h>
void ma(int n, int m, int mt[100][100]) {
	int o;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			scanf("%d", &o);
			mt[i][j] = o;
		}
	}
}
int main() {
	int n, m, a[100][100], b[100][100];
	scanf("%d %d", &n, &m);
	ma(n,m,a);
	ma(n, m, b);
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++)
			printf("%d ", a[i][j] + b[i][j]);
		printf("\n");
	}
	return 0;
}