package potter20150319_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class testPotter {

	@Test
	public void test空购物清单() {
		
		assertBookTotal(0.0, new Potter().total());
	}
	@Test
	public void test只有一本书() {
		
		assertBookTotal(8.0, new Potter().total(0));
	}
	@Test
	public void test两本相同书() {
		
		assertBookTotal(8.0*2, new Potter().total(0,0));
	}
	@Test
	public void test三本相同书() {
		
		assertBookTotal(8.0*3, new Potter().total(0,0,0));
	}
	private void assertBookTotal(double expect, double atual) {
		assertEquals(expect,atual,0.001);
	}

}
