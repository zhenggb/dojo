package potter20150319_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class testPotter {

	private static Potter POTTER = new Potter();
	@Test
	public void test空购物清单() {
		
		assertBookTotal(0.0, POTTER.total());
	}
	@Test
	public void test只有一本书() {
		
		assertBookTotal(8.0, POTTER.total(0));
	}
	@Test
	public void test两本相同书() {
		
		assertBookTotal(8.0*2, POTTER.total(0,0));
	}
	@Test
	public void test三本相同书() {
		
		assertBookTotal(8.0*3, POTTER.total(0,0,0));
	}
	@Test
	public void test两本不同书() {
		
		assertBookTotal(8.0*2*0.95, POTTER.total(0,1));
	}
	private void assertBookTotal(double expect, double atual) {
		assertEquals(expect,atual,0.001);
	}

}
