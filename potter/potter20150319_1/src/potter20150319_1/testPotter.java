package potter20150319_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class testPotter {

	private static Potter POTTER = new Potter();
	@Test
	public void test�չ����嵥() {
		
		assertBookTotal(0.0, POTTER.total());
	}
	@Test
	public void testֻ��һ����() {
		
		assertBookTotal(8.0, POTTER.total(0));
	}
	@Test
	public void test������ͬ��() {
		
		assertBookTotal(8.0*2, POTTER.total(0,0));
	}
	@Test
	public void test������ͬ��() {
		
		assertBookTotal(8.0*3, POTTER.total(0,0,0));
	}
	@Test
	public void test������ͬ��() {
		
		assertBookTotal(8.0*2*0.95, POTTER.total(0,1));
	}
	private void assertBookTotal(double expect, double atual) {
		assertEquals(expect,atual,0.001);
	}

}
