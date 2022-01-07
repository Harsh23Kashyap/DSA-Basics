#include <iostream>
#include <unordered_map>
#include <cstring>
#include <string>
using namespace std;
class Student 
{
    public:
    string firstname;
    string lastname;
    string rollno;

    Student(string f , string l, string no)
    {
        firstname=f;
        lastname=l;
        rollno=no;
    }

    bool operator==(const Student &s)
    const{
        return (rollno==s.rollno)?true:false;
    }
};

class HashFunction
{
    public:
    size_t operator()(const Student &s)
    const{
            return s.firstname.length() + s.lastname.length();
         }
}

int main()
{
    unordered_map<Student, int , HashFunction> studmap;
    Student s1=("Harsh ","Kashyap ", "019");
    Student s2=("Lovish ","Bansal ", "020");
    Student s3=("Abhey ","Singla ", "022");
    Student s4=("Abhey ","Singla ", "012");

    //Adding values
    studmap[s1]=100;
    studmap[s2]=10;
    studmap[s3]=40;
    studmap[s4]=70;

    for (auto s:studmap)
    {
        cout<<s.first.firstname<<" "<<s.first.rollno<<" Marks "<<s.second<<endl;
    }

    return 0;
}