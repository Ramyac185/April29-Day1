package week1.day1;

public class IsPrime {
	public static void main(String[] args) {
		int n = 19; 
		boolean primeStatus = true;
		
		if (n <= 1) {
			System.out.println("The given number is not a Prime");
		}
		else {
			for (int i = 2; i < n; i++) {
				if(n%i == 0) {
					System.out.println("The given number is not a Prime");
					primeStatus = false;
					break;
				}			
			}
			if (primeStatus == true) {
			System.out.println("The given number is a Prime");
			}
		}
	}
		
}
