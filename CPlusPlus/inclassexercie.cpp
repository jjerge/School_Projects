#include <iostream>
#include <stdio.h>      /* printf, scanf, puts, NULL */
#include <stdlib.h>     /* srand, rand */
#include <time.h>       // time 


using namespace std;

struct car {
  char type[80];
  char mame[80];
  int engine;
} ;

car getcar();
void win(int,car[] );
int race(car[]);
/*
JJosh Jerge
c++
*/
int main ()
{
	car mycars[3];
	for(int i=0;i<3;i++){
		mycars[i]=getcar();
	}

	int winner=race(mycars);
	
	
	win(winner,mycars);
	return 0;
}
car getcar(){
	car temp;
	cout<<"please enter the type of the car"<<endl;
	cin.getline(temp.type,80);
	cout<<"please enter the name of the car"<<endl;
	cin.getline(temp.mame,80);
	temp.engine=rand()%20+1;
	
	return temp;
}

void win(int winner,car cars[]){
	switch(winner)
	{
		case 1: cout<< cars[0].mame<<" "<<cars[0].type<<" is the winner";
			break;
		
		case 2: cout<< cars[1].mame<<" "<<cars[1].type<<" is the winner";
			break;
		
		case 3: cout<< cars[2].mame<<" "<<cars[2].type<<" is the winner";
		break;
		default: cout<<"you cheated";
		break;
	}
	cout<<"you have one way to go";
	
}
int race(car cars[]){
	int winner;
	cars[0].engine=cars[0].engine+rand()%100+1;
	cars[1].engine=cars[1].engine+rand()%100+1;
	cars[2].engine=cars[2].engine+rand()%100+1;
	if (cars[0].engine>cars[1].engine && cars[0].engine>cars[1].engine ){
	winner=1;	
	}
	else if  (cars[1].engine>cars[0].engine && cars[1].engine>cars[2].engine ){
	winner=2;	
	}
	else if  (cars[2].engine>cars[0].engine && cars[2].engine>cars[1].engine ){
	winner=3;	
	}
	return winner;
}
