#include <stdio.h>
int main()
{
    unsigned int A, N, M, K;

    scanf("%d %d %d", &N, &M, &K);

    N = K / M;
    M = K % M;

    printf("%d %d", N, M);

    return 0;
}