#include <iostream>

#include <stdlib.h>
#include "time.h"

#include <cstdlib>
//JJerge

int spin();// create a refrense of spin
int compare(int [],int );//compare
using namespace std;

int main(int argc, char** argv){

char answer;// create a char wich will be used for the If statment
int credit=10;// set credit to 10
bool playtime=true;//playtime is true
srand(time(NULL));//have random be random
while(playtime==true && credit>0){// exit the loop if play time is false or credit is less then 0

cout<<"do you want to have some fun?  \n y or n"<<endl;// ask user if they want have fun
cin>> answer;// save the answer
        if(answer== 'y'){
                credit--;//credit decress by one
                int array[3]={spin(),spin(),spin()};// creates the arry and file it with 3 random numbers
                cout<<"your numbers are "<<array[1]<<","<<array[2]<<","<<array[3]<<endl;// prints out the arry
                      credit=compare(array,credit);// add the new amount of creddit
					    }
        else{
	//cout<<"please play again?"<<endl;
	playtime=false;// have playtime set to false
             }
             
       }
       cout<<"thank you for playing"<<endl;
             cout<<"your final total is "<<credit<<endl;
             char ty;
             cin>>ty;
return 0;
}

int spin(){
    int random;// have random by a 0
    int high=7;
    int low=0;
    int range=(high-low)+low;// creates a range 0 to 10
    random=range * (rand() / (RAND_MAX + 1.0));//prints out a random number
return random;// return random
}

int compare(int array [],int credit){
	if ((array[0] == array[1]) && (array[1] == array[2]) && (array[1] == 0)){//check to see if numbers are 000 if they are they win 7 credit
			
			credit=credit+7;
			cout<<"winner, you win "<<credit<<" credits"<<endl;
			
		}
		else if ((array[0] == array[1])  && (array[1] == array[2])){//check to see if numbers are xxx if they are they win 5 credit
			
			credit=credit+5;
			cout<<"winner, you win  "<<credit<<" credits"<<endl;
			
		}
		else if ((array[0] == array[1]) && (array[0] == 0)){//check to see if numbers are 00 if they are they win 3 credit
					
			credit=credit+3;
			cout<<"winner, you win  "<<credit<<" credits"<<endl;
			
		}
		else if (array[0] == array[1]){//check to see if numbers are xx if they are they win 2 credit
			
			credit=credit+2;
	cout<<"winner, you win  "<<credit<<" credits"<<endl;
			
	}
		else if (array[0] == 0){//check to see if numbers are 0 if they are they win 1 credit
			
			credit=credit+1;
			cout<<"winner, you win  "<<credit<<"credits"<<endl;
		
			
	}
		else{
			
		cout<<"you did not win your credit is "<<credit<<endl;
		}
		return credit;
	}
