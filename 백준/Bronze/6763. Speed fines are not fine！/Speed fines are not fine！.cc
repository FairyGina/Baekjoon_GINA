#include<stdio.h>
int main() {
	unsigned int speed1, speed2, d;
	scanf("%u %u", &speed1, &speed2);
	if (speed1 >= speed2)
		printf("Congratulations, you are within the speed limit!");
	else {
		d = speed2 - speed1;
		if (d <= 20)
			printf("You are speeding and your fine is $100.");
		else {
			if (d <= 30)
				printf("You are speeding and your fine is $270.");
			else
				printf("You are speeding and your fine is $500.");
		}
	}
	return 0;
}