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

}
