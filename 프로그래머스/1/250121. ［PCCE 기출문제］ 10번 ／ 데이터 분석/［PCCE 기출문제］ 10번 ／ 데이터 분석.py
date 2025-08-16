"""
목표: data에서 ext값이 val_ext보다 작은 데이터만 뽑은 후, sort_by에 해당하는 값을 기준으로 오름차순 정렬 후 출력

입력 변수
data //정렬한 데이터 2차원 정수 배열
ext // 어떤 정보를 기준으로 데이터를 뽑을 지 의미하는 문자열
val_ext //뽑아낼 정보의 기준값을 나타내는 정수
sort_by //정보를 정렬할 기준이 되는 문자열

문제 요약
1. 데이터는 코드 번호 / 제조일 / 최대 수량 / 현재 수량 으로 구성
2. 데이터 중 조건을 만족하는 데이터만 뽑아 정렬

주의할 점

메모장

프로그램 구상
1. ext의 입력에 따라 val_ext 비교를 4가지로 만들어야함
    1-1. code인 경우[0]:
        val_ext>data[0]:
            op.append(data)
    1-2. date인 경우[1]:
        va_ext>data[1]:
            op.append(data)...
        
        
        

변수 관리

구상 코드
op=[]
valid={}
def indata(d,idx):
    global op    

for d in data:
    

"""
def indata(d,idx,val):
    if d[idx]<val:
        return True
    return False

def solution(data, ext, val_ext, sort_by):
    op=[]
    valid={"code":0, "date":1, "maximum":2, "remain":3}

    idx=valid[ext]
    for d in data:
        if indata(d,idx,val_ext):
            op.append(d)
        
    op.sort(key=lambda x:x[valid[sort_by]])
    return op