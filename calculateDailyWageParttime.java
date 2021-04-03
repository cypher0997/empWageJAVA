
public class calculateDailyWageParttime{
	public static void main( String args[]){
		int isParttime=1;
		int isFulltime=2;
		int empRatePerHr=20;
		int empHr;
		double empCheck=Math.floor(Math.random()*10)%3;
		if(empCheck == isFulltime)
			empHr=8;
		else if(empCheck == isParttime)
			empHr=4;
		else
			empHr=0;
		int salary=(empHr*empRatePerHr);
		System.out.println("sal is"+salary);
			
	}
}