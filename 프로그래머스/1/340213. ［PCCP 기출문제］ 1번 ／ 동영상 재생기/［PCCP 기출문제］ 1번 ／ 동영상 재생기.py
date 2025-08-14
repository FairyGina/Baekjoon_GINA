# """
# 목표: 사용자 입력이 모두 끝난 후 동영상의 위치를 mm:ss로 출력

# 동영상 재생기(1시간 미만)
# 1. 10초 전 이동
#     prev 명령어
#     * 현재 위치가 10초 미만이면 처음 위치로 이동
# 2. 10초 후 이동
#     next 명령어
#     * 남은 시간이 10초 미만이면 마지막 위치로 이동
# 3. 오프닝 건너뛰기
#     * 오프닝 구간(op_start/op_end) 포함 사이면 끝나는 위치(op_end)로 이동


# 입력 변수
# video_len //동영상 길이
# pos // 시작 시간
# op_start, op_end // 오프닝 시작, 종료
# commands //사용자 입력 1차원 문자열 배열

# 주의할 점
# 1. 만약 전으로 돌아가서 오프닝 사이로 돌아가면 다시 오프닝 후로 가야하는 사태 발생. 만약 오프닝 사이가 아니면 무사히 그 전으로 이동하게 함

# 프로그램 구상 F
# 1. 시간은 전부 초 단위로 관리. 비디오 길이, 시작 시간, 오프닝 시작/종료 시간 관리
#     34:33 => 34*60+33
# 2. 


# 메모장
# "34:33"	"13:00"	"00:55"	"02:55"	["next", "prev"]	"13:00"
# 변수 1. 시간이 음수 혹은 vlen초과가 되어야함
#     음수 경우: "34:33"	"00:10"	"00:55"	"02:55"	["prev", "prev"]	"00:00" * 통과
#     양수 경우: "34:33"	"34:23"	"00:55"	"02:55"	["next", "next"]    "34:33" * 통과
# 변수 2. 이동해봤는데 오프닝이라서 건너뛰어봤는데 시간 끝인 경우
#     "34:33"	"32:22"	"32:32"	"34:32"	["next"]
    
    
    
    

# 관리 변수
# vlen //video_len 초단위변환

# 구상 코드 #
# F1(line) # 초단위 변환 함수
# mnt,sec=map(line.split(":"))
# vlen=mnt*60+sec

# F2 # 현재 시간이 오프닝 중 시간이면 오프닝 종료 시간으로 이동시키는 함수
# global curtime
# if opstart<curtime<opend: # 오프닝 종료 시간으로 이동
#     curtime=opend
    
# F3


# main

# curtime=F1(line)
# F2

# for i in range(len(commands)): # 사용자 명령어에 따라 동영상 위치 변동
#     if commands[i]=="next":
#         curtime=min(curtime+10,vlen)
#     else:
#         curtime=max(curtime-10,vlen)
#     F2

# answer=f"{curtime/60} {curtime%60}"
    






# """

# F1(line) # 초단위 변환 함수
# mnt,sec=map(line.split(":"))
# vlen=mnt*60+sec

# F2 # 현재 시간이 오프닝 중 시간이면 오프닝 종료 시간으로 이동시키는 함수
# global curtime
# if opstart<curtime<opend: # 오프닝 종료 시간으로 이동
#     curtime=opend

curtime,opstart,opend=0,0,0

def f1(line):
    mnt,sec=map(int,line.split(":"))
    # print(mnt,sec)
    # print(mnt*60+sec)
    # print()
    return mnt*60+sec

def f2():
    global curtime,opstart,opend
    if opstart<=curtime<opend:
        curtime=opend
    
def solution(video_len, pos, op_start, op_end, commands):
    global curtime,opstart,opend
    vlen=f1(video_len)
    curtime=f1(pos)
    opstart=f1(op_start)
    opend=f1(op_end)
    f2()
    

    for i in range(len(commands)): # 사용자 명령어에 따라 동영상 위치 변동
        if commands[i]=="next":
            curtime=min(curtime+10,vlen)
        else:
            curtime=max(curtime-10,0)
        f2()
        # print(curtime)
        # print()

    #print(curtime)
    answer=f"{curtime//60:02d}:{curtime%60:02d}"
    return answer