#include<bits/stdc++.h>
#define fastio ios::sync_with_stdio(false); cin.tie(nullptr);
using namespace std;
static int asy,asx;
static int my[4]={0,1,1,-1},mx[4]={1,0,1,1};
static int board[21][21];
bool om(int nb){
    for(int row=0;row<21;row++){
        for(int col=0;col<21;col++){
            for(int m=0;m<4;m++){
                if(board[row][col]==nb) continue;
                int r,c,ct=0;
                for(int i=1;i<6;i++){
                    r=row+i*my[m]; c=col+i*mx[m];
                    if(r<0||r>=21||c<0||c>=21||board[r][c]!=nb) break;
                    ct++;
                }
                r=row+6*my[m]; c=col+6*mx[m];
                if(ct==5&&(r<0||r>=21||c<0||c>=21||board[r][c]!=nb)){
                    asy=row+my[m]; asx=col+mx[m];
                    return true;
                }
            }
        }
    }
    return false;
}
int main(){
    fastio;
    ostringstream as;
    for(int i=0;i<21;i++){
        board[0][i]=-1;
        board[20][i]=-1;
        board[i][0]=-1;
        board[i][20]=-1;
    }
    for(int i=1;i<20;i++){
        for(int j=1;j<20;j++){
            cin>>board[i][j];
        }
    }

    if(om(1)) as<<"1\n"<<asy<<" "<<asx;
    else if(om(2)) as<<"2\n"<<asy<<" "<<asx;
    else as<<"0";

    cout<<as.str();
    return 0;
}