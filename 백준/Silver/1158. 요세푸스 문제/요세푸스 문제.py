class Node: #노드 클래스 선언
    def __init__(self, key):
        self.key = key #노드에 저장되는 key값      
        self.next = None #다음 노드의 key값을 저장할 next값

class SinglyLinkedList: #단일연결리스트 클래스 선언
    def __init__(self):
        self.head = None	#가장 처음 노드를 가리킬 head는 아직 아무것도 가리키지 않으므로 none(리스트의 0번째 자리)
        self.size = 0 #연결리스트 탐색 노드의 개수

    def __len__(self): # 호출 시 연결리스트 탐색 노드의 개수 반환		
        return self.size

    def pushFront(self, key): #앞에 노드 추가 시
        new_node = Node(key) #새로운 노드 추가
        new_node.next = self.head #새로운 노드 다음 값이 헤드로 하게 함.
        self.head = new_node #헤드가 새로운 노드를 가리키게 함
        self.size += 1 #총 노드 수 하나 추가
        return True #True 반환

    def popFront(self):  #맨 앞의 노드 출력 및 가져오기
        if self.size > 0: #노드 총 수를 확인해 0 이상일 경우
            key = self.head.key #key 변수 선언후 head.key로 대입
            self.head = self.head.next #head 노드를 next 노드와 연결
            self.size -=1 #노드 총 수 하나 빼기(가져왔으므로)
            return key # key 값 반환
        return None #아닐 경우 None 반환

    def remove(self, x): #노드 삭제 메소드로 x노드를 모를 경우 search필요
        if self.size == 0 or x == None: #총 노드 수가 0이거나 x값이 0일 때
            return False #False 반환
        elif x == self.head: # x가 self.head값인 경우
            self.popFront() #popFront()실행
            return True #True 반환    
        else:
            prev = self.head #아닐 
            while prev.next !=x:
                prev = prev.next
            prev.next = x.next
            self.size -= 1
            return True

N, k = map(int, (input().split()))
L = SinglyLinkedList()
for i in range(N, 0, -1):
    L.pushFront(i)

line = []
x = L.head
cnt = 0
while L.size != 0:
    for _ in range(k):
        if L.size == 0:
            break
        cnt +=1
        if cnt == k:
            continue
        x = x.next
        if x == None:
            x = L.head
    L.remove(x)
    line.append(x.key)
    if len(L) == 0:
        break
print('<', end='')
print(*line, sep=', ', end='')
print('>')