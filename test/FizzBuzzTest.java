import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDivisibleBy3() {
		FizzBuzz b = new FizzBuzz();
		String result = b.buzz(3);
		assertEquals("fizz", result);
	}
	
	@Test
	public void testDivisibleBy5() {
		FizzBuzz b = new FizzBuzz();
		String result = b.buzz(5);
		assertEquals("buzz", result);
	}
	
	@Test
	public void testDivisibleBy3and5() {
		FizzBuzz b = new FizzBuzz();
		String result = b.buzz(15);
		assertEquals("fizzbuzz", result);
	}
	
	@Test
	public void testOtherNumber() {
		FizzBuzz b = new FizzBuzz();
		String result = b.buzz(4);
		assertEquals("4", result);
	}
	
	@Test
	public void testPrimeNumber() {
		FizzBuzz b = new FizzBuzz();
		String result = b.buzz(11);
		assertEquals("whizz", result);
	}

}
