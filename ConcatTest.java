package junit;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class ConcatTest {

	@Test
	public void testConcatenate() {
		Junit test = new Junit();
		String result = test.concatenate("one", "two");
		assertEquals("onetwo", result);
	}

}
