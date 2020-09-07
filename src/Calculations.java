
public class Calculations {

	public int generateRandomInt() {
		int randomInt = (int) (Math.random() * ((10 - 0) + 0)) + 1;
		return randomInt;
	}
	
	int one = generateRandomInt();
	int two = generateRandomInt();
	
	public void add() {
		System.out.println("---Addition---");
		int ans = one + two;
		System.out.println(one + " + " + two + " = " + ans);
	}
	
	public void sub() {
		System.out.println("---Subtract---");
		int ans = one - two;
		System.out.println(one + " - " + two + " = " + ans);
	}
	
	public void multiply() {
		System.out.println("---Multiplication---");
		int ans = one * two;
		System.out.println(one + " * " + two + " = " + ans);
	}
	
	public void divide() {
		System.out.println("---Division---");
		float done = one, dtwo = two;
		if (done == 0 || dtwo == 0) {System.out.println("Errpr: No zeros in division");}
		if (done>dtwo && done != 0) {
			float ans = done / dtwo;
			System.out.println(done + " / " + dtwo + " = " + ans);
		}
		else { System.out.println("Error: Second number must be bigger");}
	}
	
	public void modulo() {
		System.out.println("---Modulus---");
		int ans = one % two;
		if (one == 0 || two == 0) {System.out.println("Errpr: No zeros in division");}
		if (ans == one && one !=0) {
			System.out.println("Error: Second number must be bigger");
		}
		else {System.out.println(one + " % " + two + " = " + ans);}
	}
	
	public void indices() {
		System.out.println("---Indices---");
		double ione=one, itwo=two;
		double ans = Math.pow(ione, itwo);
		System.out.println(ione + " ^ " + itwo + " = " + ans);
	}
}
