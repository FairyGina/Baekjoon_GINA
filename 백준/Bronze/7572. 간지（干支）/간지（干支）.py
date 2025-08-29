ip=(int(input())-4)%60
print(chr(ip%12+65)+str(ip%10))