import sys
def input(): return sys.stdin.readline().rstrip()
month=["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"]
mvalue=[31,28,31,30,31,30,31,31,30,31,30,31]

mnum=365*24*60

ip=input().split()
y=0
year=int(ip[2])
if year%400==0 or (year%4==0 and year%100!=0): y=1

mnum+=24*60 if y==1 else 0
mvalue[1]+=y

anum=0
mid=month.index(ip[0])
for i in range(mid):
    anum+=mvalue[i]
anum+=int(ip[1][:-1])-1
anum*=24*60

time=ip[3].split(':')
anum+=int(time[0])*60+int(time[1])

print(anum*100/mnum)