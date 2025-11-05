import sys
def input(): return sys.stdin.readline().rstrip()
n = int(input())

index = [[(n - 1 - r) + 2 * k for k in range(r + 1)] for r in range(n)]

star = [[' '] * (2 * n - 1) for _ in range(n)]

for r in range(n):
    for c in index[r]:
        star[r][c] = '*'

for idx,row in enumerate(star,start=n):
    print(''.join(row[:idx]))