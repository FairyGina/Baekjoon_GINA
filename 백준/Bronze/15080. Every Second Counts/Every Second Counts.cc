#include<stdio.h>
int main() {
	int s1, s2, s3, f1, f2, f3, sres, fres;
	scanf("%d : %d : %d", &s1, &s2, &s3);
	scanf("%d : %d : %d", &f1, &f2, &f3);
	sres = s1 * 3600 + s2 * 60 + s3;
	fres = f1 * 3600 + f2 * 60 + f3;
	if (sres > fres) {
		fres = fres + 24 * 3600;
	}
	printf("%d", fres - sres);

	return 0;
}