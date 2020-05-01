//Employee Wage Computation Problem Solve
//@author Manjit Khurana
 class EmployeeIns{	
   private static final int IS_PART_TIME = 1;
   private static final int IS_FULL_TIME = 2;
//class variables 
    String company ;
    int numOfWorkingDays;
    int empRatePerHour;
    int maxHourInMonth;
 
//Constructor
EmployeeIns(String company ,int numOfWorkingDays,int empRatePerHour,int maxHourInMonth )
  {	 
   this.company=company;
   this.numOfWorkingDays=numOfWorkingDays;
   this.empRatePerHour=empRatePerHour;
   this.maxHourInMonth=maxHourInMonth;
 }
//Method for calculating monthly wage of employee
 
    public void calculateEmpWage(){
// Variable
	int empHrs=0;
	int totalEmpHrs=0;
	int totalWorkingDays=0;

//Computation
	while(totalEmpHrs < maxHourInMonth && totalWorkingDays < numOfWorkingDays )
	{	
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
 }
 // Main method
    public static void main (String args []){
// Pass the Value in Instance method
	final EmployeeIns dmart = new EmployeeIns("Dmart",20,20,100);
	dmart.calculateEmpWage(); 					// call calculateEmpWage method
	final EmployeeIns rer = new EmployeeIns("Reliance",20,20,100);
	rer.calculateEmpWage();						// call calculateEmpWage method
	}
 }
