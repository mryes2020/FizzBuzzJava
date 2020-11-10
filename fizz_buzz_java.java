
class system {
	public String function(int a) {
		int tester = 0; 
		String result = ""; 
		if (a % 3 == 0) {
			tester = 1; 
		}
		if (a % 5 == 0) {
			if (tester == 1) {
				tester = 3; 
			}else {
				tester = 2; 
			}
		}
		
		
		// check which path it took 
		if (tester == 1) {
			result = "Fizz"; 
		}else {
			if (tester == 2) {
				result = "Buzz"; 
			}else {
				if (tester == 3) {
					result = "FizzBuzz";
				}else {
					result = String.valueOf(a); 
				}
			}
		}
		
		return result; 
		
	}
}

public class Challenge1 {	
	// global functions 
	public static void print(String string) {
		System.out.print(string);
	}
	public static void println(String string) {
		System.out.println(string);
	}
	
	
	public static void main(String[] args) {
		int i = 30; 
		system sys = new system(); 
		for (int a = 1; a < i+1; a++) {
			println(sys.function(a));
		}
	}
}
