#include <stdio.h>

int main() {
	int dice[3] = { 0 };
	int i, res = 0;
	for (i = 0; i < 3; i++)
		scanf("%d", &dice[i]);
	if ((dice[0] == dice[1]) &&(dice[1] == dice[2])&&(dice[0]==dice[2]))
		printf("%d", 10000 + 1000 * dice[0]);
	
	else {
		if (dice[0] == dice[1])
			printf("%d", 1000 + 100 * dice[0]);
		if (dice[1] == dice[2])
			printf("%d", 1000 + 100 * dice[1]);
		if (dice[0] == dice[2])
			printf("%d", 1000 + 100 * dice[0]);
		if ((dice[0] != dice[1]) && (dice[1] != dice[2]) && (dice[0] != dice[2])) {
			for (i = 0; i < 3; i++) {
				if (res < dice[i])
					res = dice[i];
			}
			printf("%d", 100 * res);
		}
	}
	return 0;
}