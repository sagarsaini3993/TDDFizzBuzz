
public class FizzBuzz {
	
	
	public boolean checkPrime(int num) {
		
		boolean isPrime = true;
		for (int i = 2; i < num-1; i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		
		return isPrime;
	}
	
	
	public String buzz(int num) {
		boolean isPrime = checkPrime(num);
		
		if(isPrime == true) {
			return "whizz";
		}
		if (num % 5 == 0 && num % 3 == 0) {
			return "fizzbuzz";
		}
		
		else if (num % 5 == 0) {
			return "buzz";
		}
		
		else if(num % 3 == 0) {
			return "fizz";
		}
		
		return String.valueOf(num);
		 
	}
	

}
