#include <iostream>
#include <cstdio>
#include <sstream>
#include <cstring>
using namespace std;

static int n,m;
static int my[4]={0,1,0,-1},mx[4]={1,0,-1,0};
static int board[100][100],vt[100][100][4]={0};

bool fs(int y,int x){
    memset(vt,0,sizeof(vt));

    int seq=0;
    while(true){
        if(vt[y][x][seq]) return true;

        vt[y][x][seq]++;
        int c=board[y][x];
        y+=my[seq]*c; x+=mx[seq]*c;
        if(0>y||y>=n||0>x||x>=m) return false;
        seq=(seq+1)%4;
    }
}

int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    ostringstream as;
    cin>>n>>m;

    for(int r=0;r<n;r++){
        for(int c=0;c<m;c++){
            cin>>board[r][c];
        }
    }

    int ct=0;
    for(int c=0;c<n;c++){
        if(fs(c,0)){
            ct++;
            as<<c+1<<" ";
        }
    }

    cout<<ct<<"\n"<<as.str();

    return 0;
}