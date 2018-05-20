#include <iostream>
#include <cstring>

using namespace std;
/*
JJosh Jerge
c++
*/
int main ()
{
	int size=1;
	char** dymarray;
	dymarray=new char* [size];
	char** newdymarray;
	dymarray=new char* [size+1];
//char input;
	char **myarrays;
	
 char arrinput[80];
	cout<<"please enter a string"<<endl;
	cin>>arrinput;
	


 cout<<arrinput<<endl;
 
for(int i=0;i<size;i++)

{
dymarray[i]=new char [strlen(arrinput)];
for(int j=0;j<strlen(arrinput)+1;j++)
dymarray[i][j]=arrinput[j];

}
for(int i=0;i<size;i++)

{

for(int j=0;j<strlen(arrinput)+1;j++)
cout<<dymarray[i][j];

}
}
//for cstringbuild(){
	
//}


