

public class empCDWSwitch{
	public static final int isFulltime=1;
	public static final int isParttime=2;

	public static void main( String args[]){
		int empRatePerHr=20;
		double empCheck=Math.floor(Math.random()*10)%3;
		int value = (int) empCheck;
		int empHr=0;
		switch (value){
			case isFulltime:
				empHr=8;
				break;
			case isParttime:
				empHr=4;
				break;
			case 3:
				empHr=0;
			default:
				System.out.println("nothiing");
				
		}
		int salary=empHr*empRatePerHr;
		System.out.println("sal is"+salary);
	}
}
