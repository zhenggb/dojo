package potter20150319_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class testPotter {

	private Potter POTTER = new Potter();
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
	@Test
	public void test������ͬ��() {
		
		assertBookTotal(8.0*3*0.9, POTTER.total(0,1,2));
	}	
	@Test
	public void test�ı���ͬ��() {
		
		assertBookTotal(8.0*4*0.8, POTTER.total(0,1,2,3));
	}	
	@Test
	public void test�屾��ͬ��() {
		
		assertBookTotal(8.0*5*0.75, POTTER.total(0,1,2,3,4));
	}
	@Test
	public void test������ͬ���һ����() {
		
		assertBookTotal(8.0*2*0.95+8, POTTER.total(0,1,0));
	}
	@Test
	public void test������ͬ���һ����() {
		
		assertBookTotal(8.0*3*0.9+8, POTTER.total(0,1,2,0));
	}
	@Test
	public void test�ı���ͬ���һ����() {
		
		assertBookTotal(8.0*4*0.8+8, POTTER.total(0,1,2,3,0));
	}
	@Test
	public void test�屾��ͬ���һ����() {
		
		assertBookTotal(8.0*5*0.75+8, POTTER.total(0,1,2,3,4,0));
	}
	
	private void assertBookTotal(double expect, double atual) {
		assertEquals(expect,atual,0.001);
	}

}
