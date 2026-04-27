#include<stdio.h>
#include<math.h>

int main()
{
	int N;
	int i;
	double arr[1000] = { 0 };
	double max = 0, res = 0;

	scanf("%d", &N);
	for (i = 0; i < N; i++) {
		scanf("%lf", &arr[i]);
		if (arr[i] > max)
			max = arr[i];
	}

	
	for (i = 0; i < N; i++) {
		arr[i] = arr[i] * 100 / max;
		
	}


	for (i = 0; i < N; i++){
		res += arr[i];
	}
	res /= N;

	printf("%.6f\n", res);

	return 0;
}