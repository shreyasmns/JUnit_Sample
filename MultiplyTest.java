package junit;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class MultiplyTest {

	@Test
	public void test() {
		Junit test = new Junit();
		int res = test.multiply(4, 8);
		assertEquals(32, res, 0);
		
	}

}
