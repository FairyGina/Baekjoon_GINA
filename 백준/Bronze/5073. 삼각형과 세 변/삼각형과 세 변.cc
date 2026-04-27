#include<iostream>
using namespace std;
int main() {
	int triangle[3];
	int max, min, num, res;
	while (1) {
		num = 0, res = 0, max = 0, min = 1000;
		for (int i = 0; i < 3; i++) {
			cin >> triangle[i];
			if (triangle[i] > max)
				max = triangle[i];
			if (triangle[i] < min)
				min = triangle[i];
			num += triangle[i];
		}
		if (num == 0)
			break;
		else {
			if (num - max <= max)
				cout << "Invalid" << "\n";
			else {
				if (triangle[0] == triangle[1])
					res++;
				if (triangle[2] == triangle[1])
					res++;
				if (triangle[0] == triangle[2])
					res++;
				if (res == 3)
					cout << "Equilateral" << "\n";
				else if (res == 1)
					cout << "Isosceles" << "\n";
				else
					cout << "Scalene" << "\n";
			}
		}
	}
	return 0;
}