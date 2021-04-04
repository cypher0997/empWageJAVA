public class empCheck{
	public static void main (String args[]){
		int isPresent=1;
		double empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck == isPresent)
			System.out.println("emp present");
		else
			System.out.println("emp absent");
	}
}
