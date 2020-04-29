/*

*Employee Wage Computation Problem Solve

*@author Manjit Khurana

*/
import java.util.Random;

 class Employee{

	int salary;
	int attendance;
	int WagePrHr=20;

   /*
  *Method Find Employee Wage per hours and check PartTime or FullTime
  */
	  
      public int getEmpcheck(int check){

        int DayPerHr;

        if(check==0){

           System.out.println("EMPLOYEE IS FULL TIME ");
           DayPerHr = 8;
           return DayPerHr;

         }

         else{

            System.out.println("EMPLOYEE IS PART TIME ");

            DayPerHr = 4;

            return DayPerHr;

         }

      }

 /*
 *Method use array to  stores Employee monthly wage & total working hours
 */
	 
      public int[] getmonthwage(int Hours, int day, int check){

   	 int status;

	 int HrWork=0;

	 Random rand = new Random();

	 status = rand.nextInt(2);

	 int[] SalaryHr = new int[2];

	 if(status==0){

	    System.out.println("Day "+day+": Present");

	    salary+=WagePrHr*Hours;

	    if(check==0)

	       HrWork+=8;

	    if(check==1)

	       HrWork+=4;

            SalaryHr[0] = salary;

	    SalaryHr[1] = HrWork;

	    return SalaryHr;

	 }

	 else{

	    System.out.println("Day "+day+": Absent");

	    salary+=0;

            HrWork+=0;

	    SalaryHr[0] = salary;

            SalaryHr[1] = HrWork;

            return SalaryHr;

	 }

      }
  /*
      *Method use to daily wage of employee based on Full time/Part time/Absent
  */
      public int getDailyWage(int Hours){

	    int wage;

	    wage=WagePrHr*Hours;

            return wage;

      }

}

/*
*Employee Wage Computation class
*Main method
*/
		
class EmpWageComputation{

      public static void main(String []s){

     int empcheck;

	 int DailyWage;

	 int WorkHrs;

	 int TotalDays=1;

	 int end=0;

	 int [] SalaryHr = new int[2];

     System.out.println("Welcome to Employee Wage Computation Program");

	 Employee emp = new Employee();

	 Random rand = new Random();

	 empcheck = rand.nextInt(2);

	 WorkHrs = emp.getEmpcheck(empcheck);

	 DailyWage = emp.getDailyWage(WorkHrs);

	 System.out.println("The Employee daily wage is: "+DailyWage);


// Find and Calculate monthly Employee Wage   

   while (end==0){

    SalaryHr = emp.getmonthwage(WorkHrs,TotalDays,empcheck);

        if(TotalDays==20 || SalaryHr[1]==100){

		if(TotalDays==20){
			System.out.println("20 days Done");
		   break;
		}
		else{
		   System.out.println("100 working hours Done!");
		   break;
		}
	  }

	 TotalDays+=1;

         }

         System.out.println("The monthl wise wage is: "+ SalaryHr[0]);

      }

}
