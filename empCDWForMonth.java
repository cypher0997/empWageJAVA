
public class empCDWForMonth{
	public static void main( String args[]){
		int empRatePerHr=20;
		int workingDays=20;
		int tottalSalary=0;
		double empCheck=Math.floor(Math.random()*10)%3;
		int value = (int) empCheck;
		int empHr=0;
		for(int day=1;day<=workingDays;day++){
		switch (value){
			case 1:
				System.out.println("this partime hours");
				empHr=4;
				break;
			case 2:
				System.out.println("this fulltime hours");
				empHr=8;
				break;
			case 3:
				System.out.println("employ is absent");
				empHr=0;
			default:
				/*nothing*/
				
		}
		int salary=empHr*empRatePerHr;
		tottalSalary=tottalSalary+salary;
		}
		System.out.println("sal is"+tottalSalary);
	}
}
