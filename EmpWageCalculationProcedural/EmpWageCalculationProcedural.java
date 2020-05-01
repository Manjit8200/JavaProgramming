import java.util.Random;

/*
*Employee Wage Computation using procedural method
*@author Manjit Khurana
*/
public class EmpWageCalculationProcedural{

private static final int IS_PART_TIME = 0;

private static final int IS_FULL_TIME = 1;

/*
	*Method for calculating monthly wage of employee based (part time/ full time)
	*calculate employeewage
*/

      public static void calculateEmpWage(String company, int numOfDays, int empRate, int maxHrs){

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
	  System.out.println("Total EmployeeWage: "+monthlyWage);

      }

 /*
    *Main method
 */
      
 public static void main(String []s){

// calculate method call and pass the value

      calculateEmpWage("DMart",10,10,100);
      calculateEmpWage("Reliance",20,15,150);

      }
}
