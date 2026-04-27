#include <stdio.h>
int main()
{
	int H, M, m, hour, minute;

	hour = 0;
	minute = 0;

	scanf("%d %d", &H, &M);

	m = H * 60 + M - 45;
	hour = m / 60;
	minute = m - hour * 60;

	if (minute < 0)
	{
		minute = minute + 60;
		hour = hour + 23;
		printf("%d %d", hour, minute);
	}
		

	else
		printf("%d %d", hour, minute);
	

	return 0;
}