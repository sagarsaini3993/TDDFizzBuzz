
public class FizzBuzz {
	
	
	public String buzz(int num) {
		
		if (num % 5 == 0 && num % 3 == 0) {
			return "fizzbuzz";
		}
		
		else if (num % 5 == 0) {
			return "buzz";
		}
		 
		return "fizz";
	}

}
