import java.util.Random;

class Employee{

int salary;
int attendance;
int WagePrHr=20;

  public int getDailyWage(int attendance){

	 int DayPrHr=2;

	 this.attendance = attendance;

	 switch(attendance){

	  case 0:
	          System.out.println("Full time employee");
            DayPrHr = 8;
	          break;

	  case 1:
    	     System.out.println("Part time employee");
    	     DayPrHr = 4;
           break;

	  case 2:
          System.out.println("Employee absent");
    	    DayPrHr = 0;
      	  break;

	  default:
	         System.out.println("Null");
   	      break;

	 }

	 salary=WagePrHr*DayPrHr;

	 return salary;

      }

}

class EmpWageComputation{

  public static void main(String []s){

	 int attend;
	 int DailyWage;

    System.out.println("Welcome to Employee Wage Computation Program");

	 Employee person = new Employee();
	 Random rand = new Random();
	 attend = rand.nextInt(3);

	 DailyWage = person.getDailyWage(attend);

	 System.out.println("The Daily wage is: "+DailyWage);

      }

}
