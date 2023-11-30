import static org.junit.Assert.*;

import org.junit.Test;

import demo.Cube;

public class CubeTest {

	@Test
	public void test() {
		assertEquals(Cube.cube(3),28);
	}

}
