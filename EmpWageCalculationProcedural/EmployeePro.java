import java.util.Random;

/*Employee Wage Computation Problem Solve to Procedural
  @author Manjit Khurana
*/
 class EmployeePro{
     private static final int IS_PART_TIME = 1;
     private static final int IS_FULL_TIME = 2;

//Method for calculating monthly wage of employee
  public static int calculateEmpWage( String company ,int numOfWorkingDays,int empRatePerHour,int maxHourInMonth ){
// Variable
	int empHrs=0;
	int totalEmpHrs=0;
	int totalWorkingDays=0;
//Computation
	while(totalEmpHrs < maxHourInMonth && totalWorkingDays < numOfWorkingDays )	{	
    	    totalWorkingDays++;
            double empCheck = Math.floor(Math.random() * 10) % 3;
	    int empCheck1=(int)empCheck;
// Check Employee Present || Employee PartTime || Employee  Absent	
 	switch(empCheck1){
		case 0:empHrs=8;  
		System.out.println("Employee is Present");
		break;
		case 1:empHrs=4;
                System.out.println("Employee is PartTime");
		break;
		case 2:empHrs=0; 
		System.out.println("Employee is Absent");
		break;	
         	default:System.out.println("Not Avalaible");			
	}
	  totalEmpHrs+=empHrs;
	  System.out.println("Day:"+totalWorkingDays + " Employee Working Hours:" +empHrs);
  }
    System.out.println("Employee Wage Company is :"+company);
    System.out.println("Total worked Hours is :"+totalEmpHrs);
    int totalEmpWage = totalEmpHrs * empRatePerHour;
    System.out.println("Employee Total Wage:"+totalEmpWage);
    return totalEmpWage;	
}
// Main method
  public static void main (String args [])
    {
     calculateEmpWage("Dmart",20,20,100);  	   // call calculateEmpWage method for Dmart Employee
     calculateEmpWage("Reliance",20,20,80);       // call calculateEmpWage method for Reliance Employee
    }

 }
