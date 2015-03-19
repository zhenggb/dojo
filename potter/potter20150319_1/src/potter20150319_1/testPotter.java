package potter20150319_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class testPotter {

	@Test
	public void test() {
		
		assertBookTotal(0.0, new Potter().total());
	}

	private void assertBookTotal(double expect, double atual) {
		assertEquals(expect,atual,0.001);
	}

}
