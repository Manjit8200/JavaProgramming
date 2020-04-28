import java.util.Random;

class Employee{

int salary;

int attendance;

int WagePrHr=20;

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


      public int getDailyWage(int Hours){

	    int wage;

	    wage=WagePrHr*Hours;

            return wage;

      }

}


class A5{

      public static void main(String []s){

         int empcheck;

	 int DailyWage;

	 int WorkHrs;

	 int TotalDays=1;

	 int loop_end=0;

	 int [] SalaryHr = new int[2];

         System.out.println("Welcome to Employee Wage Computation Program");

	 Employee person = new Employee();

	 Random rand = new Random();

	 empcheck = rand.nextInt(2);

	 WorkHrs = person.getEmpcheck(empcheck);

	

	 DailyWage = person.getDailyWage(WorkHrs);

	 System.out.println("The Employee daily wage is: "+DailyWage);


         while (loop_end==0){

            SalaryHr = person.getmonthwage(WorkHrs,TotalDays,empcheck);


        if(TotalDays==20 || SalaryHr[1]==100){

		if(TotalDays==20){

		   System.out.println("20 days completed");

		   break;

		}

		else{

		   System.out.println("100 working hours completed!");

		   break;

		}

	    }

	 TotalDays+=1;

         }

         System.out.println("The monthl wise wage is: "+ SalaryHr[0]);

      }

}