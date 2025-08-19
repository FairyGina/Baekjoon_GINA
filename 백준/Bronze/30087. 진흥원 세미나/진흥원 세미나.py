import sys
def input(): return sys.stdin.readline().rstrip()
semi={"Algorithm":"204",
      "DataAnalysis":"207",
      "ArtificialIntelligence":"302",
      "CyberSecurity":"B101",
      "Network":"303",
      "Startup":"501",
      "TestStrategy":"105"}
op=[]
for _ in range(int(input())):
    op.append(semi[input()])

print('\n'.join(op))