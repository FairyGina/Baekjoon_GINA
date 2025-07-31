#include<bits/stdc++.h>
#define fastio ios::sync_with_stdio(false); cin.tie(nullptr);
using namespace std;
int main(){
    fastio;
    ostringstream as;
    int my[4]={-1,1,0,0},mx[4]={0,0,-1,1};
    int r,c;
    cin>>r>>c;
    vector<vector<char>> ume(r,vector<char>(c)),cu(r,vector<char>(c));

    for(int i=0;i<r;i++){
        string s;
        cin>>s;
        for(int j=0;j<c;j++){
            ume[i][j]=s[j];
        }
    }
    cu=ume;
    for(int y=0;y<r;y++){
        for(int x=0;x<c;x++){
            if(ume[y][x]=='X'){
                int ct=0;
                for(int m=0;m<4;m++){
                    int ty=y+my[m],tx=x+mx[m];
                    if(ty<0||ty>=r||tx<0||tx>=c||ume[ty][tx]=='.') ct++;
                }
                if(ct>2) cu[y][x]='.';
            }
        }
    }
    int sy=r-1,sx=c-1,ey=0,ex=0;
    for(int y=0;y<r;y++){
        for(int x=0;x<c;x++){
            if(cu[y][x]=='X'){
                if(sx>x) sx=x;
                if(ex<x) ex=x;
                if(sy>y) sy=y;
                if(ey<y) ey=y;
            }
        }
    }
    for(int i=sy;i<=ey;i++){
        for(int j=sx;j<=ex;j++) as<<cu[i][j];
        as<<'\n';
    }
    cout<<as.str();
}