/*
 * Josh Jerge
 * based on PatronsQueueMonitor by Elivsh Foster
 * 
 */
package pasientdriver;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 * @author jerge_000
 */
public class ClinicDriver {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static Queue Arraylist;
	public static Queue arraylistbob;
	public static Queue arraylisted;
	public static Queue arraylisttom;
	public static Queue[] array;
	// public static int size;
	public static final String Heading = "welcome to hospital";

	// public static boolean[] boolArray= new boolArray[]{ boolean bob,boolean
	// ed,boolean tom};
	public static void main(String[] args) {
		int y, size;
		String doctor = "please chocie the doctor you would like to modify \n"
				+ "1. Doctor bob \n" + "2. Doctor ed \n" + "3. Doctor tom /n" +"4. if you would would like to quite";

		String PromptString = "1. set max number for dorctor \n"
				+ "2. insert pasent info \n" + "3. List pasents  \n"
				+ "4. Remove pasents \n" + "5. Check Size of pasents \n"
				+ "6. Empty the Queue \n" + "0. Quit Processing";
		boolean ExitTime = false, quite = false;
		int NextUserAction, Option, PatronsListSize;
		Object[] clinicArray = null;

		Initialize(); // Initialize the queue
		while (!quite) {
			//Queue[] array = { arraylistbob, arraylisted, arraylisttom };
			y = Integer.parseInt(JOptionPane.showInputDialog(null, doctor,
					Heading, JOptionPane.QUESTION_MESSAGE));

			while (!ExitTime) // While user wishes to continue
			{ Queue[] array = { arraylistbob, arraylisted, arraylisttom };
				// y = Integer.parseInt(JOptionPane.showInputDialog(null,
				// doctor, Heading, JOptionPane.QUESTION_MESSAGE));
				// Present menu and process user's request

				size = arraylistbob.size();
				Option = Integer.parseInt(JOptionPane.showInputDialog(null,
						PromptString, Heading, JOptionPane.QUESTION_MESSAGE));

				switch (Option) {
				case 0: {
					ExitTime = true;
					break;
				}
				case 1: {int z= Integer.parseInt(JOptionPane.showInputDialog(null, "please enter the maximam number or patients?", Heading, JOptionPane.QUESTION_MESSAGE));
					status(y,z);
					break;
				}
				case 2: {
					input(y-1);
					break;
				}
				// case 3: {if (size > 0) {ListPatrons(); break;}
				// case 2: {if (PatronsListSize > 0) {PatronsArray =
				// PatronsList.toArray(); QueryPatron(PatronsArray,
				// PatronsListSize);} break;}
				case 3: {
					if (size > 0) {
						clinicArray = array[y - 1].toArray();
						List(clinicArray, size);
					}
					;
					break;
				}
				 case 4: {if (size > 0) remove(y-1); break;}
				// case 4: {CheckSize(arraylistbob); break;}
				 case 6: {if (size > 0) Empty(y-1); break;}
				}
if(y==4){quite = true;}
			}
		}
	}

	// }

	public static void status(int x, int z) {
		Queue[] array = { arraylistbob, arraylisted, arraylisttom };
		int e=array[x].size();
		ClinicPatient.Open(e,z);
		//nt z;
		
	}

	public static void input(int y) {

		System.out.println(y);
		int NumberOfPatient, x, Patrons;

		ClinicPatient CurrentPatient;

		NumberOfPatient = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Number of Patrons: ", Heading, JOptionPane.QUESTION_MESSAGE));
		// PatronsList.ensureCapacity(PatronsList.size() + NumberOfPatrons);

		for (x = 1; x <= NumberOfPatient; x++) {
			CurrentPatient = new ClinicPatient();
			CurrentPatient.inputdata(x); // Prompt For and Accept LibraryPatron
											// Data
			
			 switch (y)
			{
			 case 0: {arraylistbob.addRear(CurrentPatient); break;}
			 case 1: {arraylisted.addRear(CurrentPatient); break;}
			 case 2: {arraylisttom.addRear(CurrentPatient); break;}
			 }
			// String OutString;
			/// for (x = 1; x <= 1; x++)

		}

	}

	public static void remove(int y) {
	    {
	    	Queue[] array = { arraylistbob, arraylisted, arraylisttom };
	        String Prompt, Heading = "Removal of Items from the Queue";
	        int x, RemovalAmount, NextUserAction; Object bm;
	        
	        // Prompt for number of items to be popped
	        RemovalAmount = Integer.parseInt(JOptionPane.showInputDialog(null, "How many people would you like to remove from the list?", Heading, JOptionPane.QUESTION_MESSAGE));
	        while (RemovalAmount > array[y].size()) // While invalid range
	        {
	            JOptionPane.showMessageDialog(null, "There is not enough people on the list for that, Please chocie a smaller number. ", Heading, JOptionPane.ERROR_MESSAGE);
	            RemovalAmount = Integer.parseInt(JOptionPane.showInputDialog(null, "How many people would you like to remove from the list?", Heading, JOptionPane.QUESTION_MESSAGE));
	        } 
	        Prompt = RemovalAmount + " items are about to be removed from the queue.\n" + "Click Yes to remove the items. Click No or Cancel to exit.";
	        NextUserAction = JOptionPane.showConfirmDialog(null, Prompt);
	        if (NextUserAction == JOptionPane.YES_OPTION)
	        {for (x = 1; x <= RemovalAmount; x++) bm = array[y].removeFront();} 
	    }
	}

	//public static void readion() {
		
	//}

	public static void Empty(int y) {
		Queue[] array = { arraylistbob, arraylisted, arraylisttom };
	        int x, NextUserAction;
	        String RemovalPrompt = "You are about to Delete all items on the list, are you sure? " + "Click Yes to Empty. Click No or Cancel to exit.";
	        NextUserAction = JOptionPane.showConfirmDialog(null, RemovalPrompt);
	        if (NextUserAction == JOptionPane.YES_OPTION) array[y].clear();
	}

	public static void List(Object[] ThisList, int ListSize) {
		int x = ListSize;
		int Lim = ListSize;
		String OutputS = "";
		for (x = 0; x < ListSize; x++) {
			ThisList[x] = (ClinicPatient) ThisList[x];
		}
		for (x = 1; x <= Lim; x++) {
			OutputS += (((ClinicPatient) ThisList[x - 1]).printme());

		}
		JOptionPane.showMessageDialog(null,OutputS , Heading, JOptionPane.INFORMATION_MESSAGE);
		//System.out.println(OutputS);
	}

	public static void CheckSize(Queue ThisList) {
		JOptionPane.showMessageDialog(null, "There are " + ThisList.size()
				+ " patrons in the queue", Heading,
				JOptionPane.INFORMATION_MESSAGE);
	}

	public static void Initialize() {
		arraylistbob = new Queue();
		arraylisted = new Queue();
		arraylisttom = new Queue();
		Queue[] array = { arraylistbob, arraylisted, arraylisttom };

	}
}
// }

