public class CompanyEmpWage{
	
	 public final String company ;
	 public final int numOfWorkingDays;
	 public final int empRatePerHour;
	 public final int maxHourInMonth;
	 public int totalEmpWage;

public CompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHourInMonth )
  {	 
   this.company=company;
   this.numOfWorkingDays=numOfWorkingDays;
   this.empRatePerHour=empRatePerHour;
   this.maxHourInMonth=maxHourInMonth;
 }


public void setTotalEmpWage(int totalEmpWage){
	this.totalEmpWage=totalEmpWage;
}
@Override
public String toString(){
	return "Total Emp Wage for Comapny :" +company+"is : "+totalEmpWage;
}
}
