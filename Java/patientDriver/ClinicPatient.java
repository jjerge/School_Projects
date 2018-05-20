/*
 * josh jerge
 * based on Library Patron by Elvis Foster                          
 */
package pasientdriver;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 *
 * @author jerge_000
 */
public class ClinicPatient { 
    protected String name;
 protected String phonenumber;
 protected String address;
 private String Status;
protected String gender;
private int code;
public static Queue[] array;
public static boolean opean;
    

public ClinicPatient()
{
name=" ";
phonenumber=" ";
address=" ";
Status=" ";
gender=" ";
code=0;
}

public  void Modify (ClinicPatient ThisOne){
this.name=name;
this.phonenumber= phonenumber; 
this.address= address;
this.Status=Status;;
this.gender=gender;;
this.code=code;

}
public  void inputdata(int x)
{// works fine no problem 
   int inphonenumber; 
   
 name= JOptionPane.showInputDialog(null, "Please Enter patient Name" + x, JOptionPane.QUESTION_MESSAGE);
phonenumber= JOptionPane.showInputDialog(null, "Please Enter patient phonenumber " + x, JOptionPane.QUESTION_MESSAGE);

address= JOptionPane.showInputDialog(null, "Please Enter patient address " + x, JOptionPane.QUESTION_MESSAGE);
Status= JOptionPane.showInputDialog(null, "Please Enter patient status  " + x, JOptionPane.QUESTION_MESSAGE);
gender= JOptionPane.showInputDialog(null, "Please Enter patient gender   " + x, JOptionPane.QUESTION_MESSAGE);
code = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter the code for the patient " + x, JOptionPane.QUESTION_MESSAGE));
//code= Integer.parseInt(null, "Please Enter patient's code " + x, JOptionPane.QUESTION_MESSAGE);   
}


public  String printme() 
{String printme="patient Name: " + name + "\n" + "phone number: " + phonenumber + "\n" +
       "address " + address + "\n" + "Status: " + Status + "\n"+ "gender"+ gender + "\n"+ "gender"+ gender + "\n"+ "the pasiont code"+ code  ;
return printme;
}

public static boolean Open(int userinput, int size)
{boolean Open=true;
    if (userinput< size){Open=false; System.out.println("the list is opean");} 
    else{Open=true;System.out.println("the list is closed ");}
    
return Open;

}
public static boolean opean()
{
	return opean;
}


   
}
