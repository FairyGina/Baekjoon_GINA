#include<stdio.h>
int main() {
	unsigned long long t;
	unsigned long long time[4] = { 0 };
	scanf("%llu", &t);
	time[0] = t / 300;
	time[1] = (t - time[0]*300) / 60;
	time[2] = (t - time[0] * 300 - time[1] * 60);

	if (time[2] % 10)
		printf("-1");
	else {
		time[2] /= 10;
		for (int i = 0; i < 3; i++)
			printf("%llu ", time[i]);
	}
	return 0;
}