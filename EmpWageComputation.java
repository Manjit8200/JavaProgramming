import java.util.Random;

class Employee{

int salary;

int attendance;

int WagePrHr=20;

      public int getEmpType(int type){

        int DayPrHr;

        if(type==0){

           System.out.println("EMPLOYEE IS FULL TIME ");

           DayPrHr = 8;

           return DayPrHr;

         }

         else{

            System.out.println("EMPLOYEE IS PART TIME ");

            DayPrHr = 4;

            return DayPrHr;

         }

      }


      public int[] getMonthlyWage(int Hours, int day, int type){

   	 int status;

	 int hrs_worked=0;

	 Random rand = new Random();

	 status = rand.nextInt(2);

	 int[] salary_and_hours = new int[2];

	 if(status==0){

	    System.out.println("Day "+day+": Present");

	    salary+=WagePrHr*Hours;

	    if(type==0)

	       hrs_worked+=8;

	    if(type==1)

	       hrs_worked+=4;

            salary_and_hours[0] = salary;

	    salary_and_hours[1] = hrs_worked;

	    return salary_and_hours;

	 }

	 else{

	    System.out.println("Day "+day+": Absent");

	    salary+=0;

            hrs_worked+=0;

	    salary_and_hours[0] = salary;

            salary_and_hours[1] = hrs_worked;

            return salary_and_hours;

	 }

      }


      public int getDailyWage(int Hours){

	    int wage;

	    wage=WagePrHr*Hours;

            return wage;

      }

}


class EmpWageComputation{

      public static void main(String []s){

         int empType;

	 int DailyWage;

	 int WorkHrs;

	 int TotalDays=1;

	 int loop_end=0;

	 int [] salary_and_hours = new int[2];

   System.out.println("Welcome to Employee Wage Computation Program");

	 Employee person = new Employee();

	 Random rand = new Random();

	 empType = rand.nextInt(2);

	 WorkHrs = person.getEmpType(empType);

	

	 DailyWage = person.getDailyWage(WorkHrs);

	 System.out.println("The daily wage is: "+DailyWage);


         while (loop_end==0){

            salary_and_hours = person.getMonthlyWage(WorkHrs,TotalDays,empType);


        if(TotalDays==20 || salary_and_hours[1]==100){

		if(TotalDays==20){

		   System.out.println("20 days over!");

		   break;

		}

		else{

		   System.out.println("100 working hours completed!");

		   break;

		}

	    }

	 TotalDays+=1;

         }

         System.out.println("The monthly wage is: "+ salary_and_hours[0]);

      }

}
