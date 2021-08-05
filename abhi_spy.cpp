#include<bits/stdc++.h>
using namespace std;
void func(string s)
{
    if(s.size()==1){
        cout << s;
    return;
    }
    if(s.size()==2){
        cout << s;
    return;
    }
    int index;
    if(s.size()%2!=0)
        index=(s.size()/2);
    else
        index=((s.size()/2)-1);
    cout << s[index];
    func(s.substr(0,index));
    func(s.substr(index+1,s.size()));
}
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int x;
        string s;
        cin >> x;
        cin >> s;
        func(s);
        cout << endl;
    }
    return 0;
}
 
