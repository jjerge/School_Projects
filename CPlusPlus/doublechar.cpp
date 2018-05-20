#include <iostream>
#include <cstring>

using namespace std;
/*
JJosh Jerge
c++



istream& operator>>(istream& input,const mystring& m){
			getline(m.setstring(),80);
		
			return input;
			
			
		}
*/
int main ()
{
	int size=0;
	char** dymarray;
	dymarray=new char* [size];
	//do 
	//prompt user
	//getstring from user
	//
	
	//for shallow copy set temp[i]=dymarray[i]
	// last indextemp{lastindex}=size of cstring;
	//string copy destination temp{lastindex} source user input;
	//delete dymarrayv 
	//point dymarry to temp
	// size++;
	//while(strmp(userinput,"quit")does not = 0):
	//forloop print dymarray;
	
	
//char input; 	int size=0;
	char** dymarray;
	dymarray=new char* [size];
	char **myarrays;
	
 char arrinput[80];
 //bool input=true;
 do{

	cout<<"please enter a string"<<endl;
	cin.getline(arrinput,80);
	cout<<arrinput<<endl;
	char** temparray;
	temparray=new char* [size+1];
	for(int i=0;i<size+1;i++){
		
	temparray[i]=dymarray[i];
	
}
	


		temparray[size]=new char [strlen(arrinput)];
	
cout<<"this is t"<<temparray[i]<<"and this is dyn"<<dymarray[i]<<endl;
	
	
	
	delete dymarray;
	dymarray=temparray;
	size++;

}while(strcmp(arrinput,"quit")!= 0);
for(int i=0;i<size;i++){
cout<<dymarray[i];
}
}

