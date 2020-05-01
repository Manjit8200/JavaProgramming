/*
*Employee Wage Computation using Instance method
*@author Manjit Khurana
*/

import java.util.Random;
//Employee Wage class using Instance method
public class EmpWageInstance{

//Constants
	private static final int IS_PART_TIME = 0;
	private static final int IS_FULL_TIME = 1;

/*class variables*/
	private String company;
	private int numOfDays;
	private int empRate;
	private int maxHrs;

//Constructor
public EmpWageInstance(String company, int numOfDays, int empRate, int maxHrs){

	this.company = company;
	this.numOfDays = numOfDays;
	this.empRate = empRate;
	this.maxHrs = maxHrs;
}

/*
	*Method for calculating monthly wage of employee based (part time/ full time)
	*calculate employeewage
*/

	private void calculateEmpWageInstance(){
	  int empCheck;
		int totalWorkingDays = 1;
		int totalWorkingHours = 0;
    int monthlyWage = 0;
		int daysPresent = 0;
		int WorkingHour = 0;
		int empHours = 0;
		int empAttendance;
		

		Random rdom = new Random();

		empCheck = rdom.nextInt(2);

		switch(empCheck){

		case IS_PART_TIME:

			System.out.println("PART TIME EMPLOYEE");

			empHours = 4;

		break;

		case IS_FULL_TIME:

			System.out.println("FULL TIME EMPLOYEE");

			empHours = 8;

		break;

		default:

			System.out.println(" ");

		break;

		}

		 while(true){

         empAttendance = rand.nextInt(2);

         if(empAttendance == 0){

            daysPresent += 1;

            System.out.println("Day "+totalWorkingDays+": Present");

            monthlyWage += empRate * empHours;

            WorkingHour += empHours;

         }

         else{

            System.out.println("Day "+totalWorkingDays+": Absent");

            monthlyWage += 0;

            WorkingHour += 0;

         }
		 
         if(totalWorkingDays == numOfDays || !(totalWorkingHours < maxHrs)){

            if(totalWorkingDays == numOfDays){

                   System.out.println(numOfDays+" days are over!");

              break;

            }

            else{

            System.out.println(maxHrs+" hours reached!");

            break;

            }

         }
			totalWorkingDays++;
      	totalWorkingHours += empHours;

      }
	
    System.out.println("Employee Company is: "+company );
	  System.out.println("Number of day "+numOfDays);
	  System.out.println("days: "+daysPresent);
	  System.out.println("Working Hours: "+WorkingHour);
	  System.out.println("Total EmployeeWage: "+monthlyWage);

   }

   /*

   *Main method

   */

   public static void main(String []s){

	final EmpWageInstance Dmart = new EmpWageInstance("Dmart",30,20,100);
		Dmart.calculateEmpWageInstance();

	final EmpWageInstance Rer = new EmpWageInstance("Reliance",25,15,150);
		Rer.calculateEmpWageInstance();


   }

}
