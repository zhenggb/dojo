package potter20150319_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class testPotter {

	@Test
	public void test�չ����嵥() {
		
		assertBookTotal(0.0, new Potter().total());
	}
	@Test
	public void testֻ��һ����() {
		
		assertBookTotal(8.0, new Potter().total(0));
	}
	@Test
	public void test������ͬ��() {
		
		assertBookTotal(8.0*2, new Potter().total(0,0));
	}
	@Test
	public void test������ͬ��() {
		
		assertBookTotal(8.0*3, new Potter().total(0,0,0));
	}
	private void assertBookTotal(double expect, double atual) {
		assertEquals(expect,atual,0.001);
	}

}
