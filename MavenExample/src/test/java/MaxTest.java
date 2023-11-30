import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import demo.Max;

public class MaxTest {
    
	@Before
	public void testingbefore() {
		
	}
	
	@Test
	public void test() {
		assertEquals(5, Max.max(new int []{1,3,4,5}));
	}

}
