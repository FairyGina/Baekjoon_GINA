# [Silver III] 장난감 자물쇠 - 32373 

[문제 링크](https://www.acmicpc.net/problem/32373) 

### 성능 요약

메모리: 35944 KB, 시간: 240 ms

### 분류

수학, 정렬

### 제출 일자

2025년 5월 27일 15:40:19

### 문제 설명

<p>장난감 자물쇠는 주식회사 sk14cj에서 아기들의 숫자 교육을 위해 만든 특별한 자물쇠입니다. </p>

<p>이 자물쇠의 잠금을 해제하려면 $N$개의 정수로 구성된 수열을 오름차순으로 나열해야 합니다. 이 수열에는 중복된 수 없이 $0$부터 $N-1$까지의 정수가 각각 하나씩 있습니다.</p>

<p>평범하게 수열의 수들을 교환할 수 있으면 재미없다고 판단한 sk14cj사는, 주어진 양의 정수 $k$에 대하여 수열에서 거리가 $k$인 쌍만 교환할 수 있게 하였습니다. 즉, 임의의 정수 $1 \le i \le N - k$에 대하여, $i$번째 수와 $i+k$번째 수를 교환할 수 있습니다. 이 때문에 수열을 오름차순으로 나열할 수 없는 불량품이 발생하기 시작했습니다.</p>

<p>따라서, 여러분은 장난감 자물쇠의 초기 상태를 입력받고, 불량품인지 판별하는 프로그램을 작성해야 합니다.</p>

### 입력 

 <p>첫 번째 줄에 수열의 길이 $N$과 숫자를 서로 교환할 수 있는 간격 $k$가 공백으로 구분되어 주어집니다.$(2 \leq N \leq 200\,000, 1 \leq k \lt N)$</p>

<p>두 번째 줄에 장난감 자물쇠 수열의 초기 상태를 나타내는 $0$보다 크고 $N-1$보다 작거나 같은 정수 $A_1, A_2 ... A_N$이 차례대로 공백으로 구분되어 주어집니다. 수열에 중복된 값은 존재하지 않으며, $A_i$는 자물쇠의 수열의 $i$번째 값입니다.</p>

### 출력 

 <p>정상적인 제품일 경우 <code><span style="color:#e74c3c;">Yes</span></code>를, 불량품이라면 <code><span style="color:#e74c3c;">No</span></code>를 출력해주세요.</p>

