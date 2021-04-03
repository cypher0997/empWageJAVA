
public class empCDWSwitch{
	public static void main( String args[]){
		int empRatePerHr=20;
		double empCheck=Math.floor(Math.random()*10)%3;
		int value = (int) empCheck;
		int empHr=0;
		switch (value){
			case 1:
				empHr=4;
				break;
			case 2:
				empHr=8;
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