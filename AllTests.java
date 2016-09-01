package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
@RunWith(Suite.class)
@SuiteClasses({ ConcatTest.class, MultiplyTest.class })
public class AllTests {

}
