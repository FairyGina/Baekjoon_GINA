#include<iostream>
#include<cmath>
using namespace std;
int main() {
	double T;
	double n;
	cin >> n;
	T = (sqrt(3) / 4) * (n * n);
	printf("%.10lf", T);
	return 0;
}