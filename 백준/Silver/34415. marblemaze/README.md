# [Silver IV] marblemaze - 34415 

[문제 링크](https://www.acmicpc.net/problem/34415) 

### 성능 요약

메모리: 32412 KB, 시간: 36 ms

### 분류

구현, 시뮬레이션

### 제출 일자

2026년 3월 28일 16:05:23

### 문제 설명

<p>Martin is building a magical marble machine. Marbles roll all around it making majestic music. To make the machine interesting, Martin collects all the marbles into a funnel and then drops them one after another into a square maze assembled on the bottom of the machine.</p>

<p>The maze is a grid of ramps and seesaws. When marbles land on a ramp, they will always roll in the direction the ramp faces. When marbles land on a seesaw, they alternate rolling in two opposite directions. Your job is to figure out where marbles will fall out of the maze so that Martin can catch them before they roll away and get lost.</p>

### 입력 

 <p>The first line of input consists of three space-separated integers $W$ ($1 \le W \le 10$), $H$ ($1 \le H \le 10$), and $N$ ($1 \le N \le 100$) where $W$ is the width of the grid, $H$ is the height of the grid, and $N$ is the number of marbles Martin needs to catch.</p>

<p>The second line of input consists of two integers $X_0$ ($0 \le X_0 < W$) and $Y_0$ ($0 \le Y_0 < H$) separated by a space. Martin's funnel will sequentially drop each of the $N$ marbles onto the ramp or seesaw at the grid position $(X_0, Y_0)$. No two marbles can be in the maze at the same time.</p>

<p>The remainder of the input consists of the grid itself: $H$ lines of text, each $W$ characters in length. Every character is one of:</p>

<ul>
	<li>"<code><</code>" -- A ramp that sends marbles leftwards.</li>
	<li>"<code>></code>" (greater-than symbol) -- A ramp that sends marbles rightwards.</li>
	<li>"<code>^</code>" (caret symbol) -- A ramp that sends marbles upward.</li>
	<li>"<code>v</code>" (lowercase letter V) -- A ramp that sends marbles downwards.</li>
	<li>"<code>-</code>" (dash) -- A seesaw which sends the 1<sup>st</sup> marble left, the 2<sup>nd</sup> right, the 3<sup>rd</sup> left, and so on.</li>
	<li>"<code>|</code>" (vertical bar) -- A seesaw which sends the 1<sup>st</sup> marble up, the 2<sup>nd</sup> down, the 3<sup>rd</sup> up, and so on.</li>
	<li>"." (period) -- A hole in the maze. If a marble lands here, it will fall out.</li>
</ul>

<p>The character in the upper-left of the grid has position $(0, 0)$ and the character in the lower-right has position $(W - 1, H - 1)$. Any ramp, seesaw, or hole $y$ lines from the start of the grid and $x$ characters from the start of a line is at position $(x, y)$.</p>

<p>It is impossible for any marble to roll forever since that would violate the laws of physics! Each marble will land on each ramp or seesaw at most once before eventually falling through a hole in the maze or off the side of the grid.</p>

### 출력 

 <p>Predict the $(x, y)$ position where each of the $N$ marbles will fall through a hole in the maze or off the side of the grid. Then output $N$ lines, each consisting of the two integers $x$ ($-1 \le x \le W$) and $y$ ($-1 \le y \le H$) separated by a space. Each $(x, y)$ must be the position of a hole or else one square from the edge of the grid.</p>

