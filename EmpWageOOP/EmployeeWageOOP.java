/*
*Employee Wage Computation
*@author Manjit Khurana
*/

import java.util.Random;

public class EmployeeWageOOP{

//Constants
private static final int IS_PART_TIME = 0;
private static final int IS_FULL_TIME = 1;

//class variables for company
private static String company;
private static int numOfDays;
private static int empRate;
private static int maxHrs;



	public EmployeeWageOOP(String company, int numOfDays, int empRate, int maxHrs)
	{
		this.company = company;
		this.numOfDays = numOfDays;
		this.empRate = empRate;
		this.maxHrs = maxHrs;
	}

	/*
	*Main method
	*/

	public static void main(String []s){

		EmployeeWageOOP bridgelabz = new EmployeeWageOOP("DMart",20,20,100);

    int totalWorkingDays = 1;
	  int totalWorkingHours = 0;

	
	  int empCheck;
	  int empHours = 0;

	  int empAttendance;
	  int monthlyWage = 0;
	  int daysPresent = 0;
	  int WorkingHour = 0;

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

          empAttendance = rdom.nextInt(2);

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

          if(totalWorkingDays == numOfDays || !(totalWorkingHours <= maxHrs)){

              if(totalWorkingDays == numOfDays){
                   System.out.println(numOfDays+" days are Completed");
                   break;

              }
              else{
              System.out.println(maxHrs+" hours ");
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
	  System.out.println("Total EmployeeWageOOP: "+monthlyWage);
	}
}
