#include <stdio.h>
int main() {
    float t, cm, kg, bm;
    scanf("%f", &t);
    for (int i = 0; i < t; i++) {
        scanf("%f %f", &cm, &kg);
        bm = kg / (0.0001 * cm * cm);
        if (cm < 140.1) printf("6\n");
        else if (cm < 146) printf("5\n");
        else if (cm < 159) printf("4\n");
        else if (cm < 161) {
            if ((bm >= 16.0) && (bm < 35.0)) printf("3\n");
            else printf("4\n");
        }
        else {
            if ((bm >= 20.0) && (bm < 25.0)) printf("1\n");
            else if ((bm >= 18.5) && (bm < 30.0)) printf("2\n");
            else if ((bm >= 16.0) && (bm < 35.0)) printf("3\n");
            else printf("4\n");
        }
    }
    return 0;
}