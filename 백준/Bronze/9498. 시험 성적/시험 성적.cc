#include <stdio.h>

int main()
{
	int Exam;

	scanf("%d", &Exam);

	if ((Exam <= 100) && (Exam >= 90))
		printf("A");
	if ((Exam < 90) && (Exam >= 80))
		printf("B");
	if ((Exam < 80) && (Exam >= 70))
		printf("C");
	if ((Exam < 70) && (Exam >= 60))
		printf("D");
	if (Exam < 60)
		printf("F");


	return 0;
}