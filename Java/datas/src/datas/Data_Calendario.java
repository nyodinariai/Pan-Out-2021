package datas;

import java.util.Calendar;

public class Data_Calendario {

	public static void main(String[] args) {
		//create a new calendar
		
		Calendar calendario1 = Calendar.getInstance();
		System.out.println(calendario1);
		System.out.println("------------------------------");
		
		Calendar calendario2 = (Calendar) Calendar.getInstance();
		Calendar calendario3 = (Calendar) Calendar.getInstance();
		
		//print the current date and time
		System.out.println("calendario1 antes " + calendario1.getTime()); //Print current date
		System.out.println("calendario2 antes " + calendario2.getTime());
		System.out.println("calendario3 antes " + calendario3.getTime());
		System.out.println("------------------------------");
		
		calendario1.add((Calendar.MONTH), 2); // add 2 months to current date
		calendario2.add((Calendar.YEAR), 5); // add 5 years to current year
		calendario3.add((Calendar.DAY_OF_MONTH), 10); // add 10 days current day
		
		System.out.println("calendario depois" + calendario1.getTime());
		System.out.println("calendario depois" + calendario2.getTime());
		System.out.println("calendario depois" + calendario3.getTime());
	}
	
}
