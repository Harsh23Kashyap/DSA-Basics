
#include <iostream> 
#include <string>
#include <algorithm>
using namespace std; 

// driver code 
int main() 
	{ 
        char s[100]="I want, to have orange juice";
        char *ptr=strtok(s," ");
        while(true)
        {
            ptr=strtok(NULL,",");
            cout<<ptr<<endl;
            string s1=ptr;
            if(s1.empty())break;
        }
        return 0;
    }