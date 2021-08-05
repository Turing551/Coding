#include <iostream>
using namespace std;
int remindermod11(string str)
{
  	int len=str.length();
  	int num,rem=0;
  	for(int i=0;i<len;i++)
    {
      	num=rem*10 + (str[i]-'0');
      	rem=num%11;
    }
  return rem;
}
int main() 
{
   	string str;
  	cin>>str;
  	cout<<remindermod11(str);
    return 0;
}
