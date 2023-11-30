import static org.junit.Assert.*;

import org.junit.Test;

import demo.Addition;

public class AdditionTest {

	@Test
	public void test() {
		assertEquals(Addition.add(3, 5),8);
	}

}
