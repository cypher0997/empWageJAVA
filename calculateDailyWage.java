
public class calculateDailyWage{
	public static void main( String args[]){
		int isPrsent=1;
		double empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck == isPrsent){
			int empRatePerHr=20;
			int empHr=8;
			int salary=(empRatePerHr*empHr);
			System.out.println("total sal is"+salary);
		}
		else
			System.out.println("sal is 0");
	}		
}