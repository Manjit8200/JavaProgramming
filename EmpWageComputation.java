import java.util.Random;
class Employee{

int salary;

int attendance;

int WagePrHr=20;



      public int getEmpType(int type){

       int DayPrHr;

       if(type==0){

          System.out.println("EMPLOYEE IS FULL TIME");

          DayPrHr = 8;

          return DayPrHr;

       }

       else{

          System.out.println("EMPLOYEE IS PART TIME");

          DayPrHr = 4;

          return DayPrHr;

       }

      }


  public int getMonthlyWage(int Hours, int day){

	int status;

	Random rand = new Random();

	status = rand.nextInt(2);

	if(status==0){

	    System.out.println("Day "+day+": Present");								

      	    salary=WagePrHr*Hours;

      	    return salary;

	}

	else{

	    System.out.println("Day "+day+": Absent");

	    salary=0;																			

	    return salary;

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
	int MonthWage=0;
	int WorkHrs;
	int get_wage;

  System.out.println("Welcome to Employee Wage Computation Program");

	Employee person = new Employee();

	Random rand = new Random();

	empType = rand.nextInt(2);

	WorkHrs = person.getEmpType(empType);

	DailyWage = person.getDailyWage(WorkHrs);

     for (int i=1;i<=20;i++){
            MonthWage += person.getMonthlyWage(WorkHrs,i);
	}

        System.out.println("The monthy wage (20 days) is: "+MonthWage);

      }

}
