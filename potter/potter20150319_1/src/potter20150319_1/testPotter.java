package potter20150319_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class testPotter {

	private Potter POTTER = new Potter();
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
	@Test
	public void test三本不同书() {
		
		assertBookTotal(8.0*3*0.9, POTTER.total(0,1,2));
	}	
	@Test
	public void test四本不同书() {
		
		assertBookTotal(8.0*4*0.8, POTTER.total(0,1,2,3));
	}	
	@Test
	public void test五本不同书() {
		
		assertBookTotal(8.0*5*0.75, POTTER.total(0,1,2,3,4));
	}
	@Test
	public void test两本不同书和一本书() {
		
		assertBookTotal(8.0*2*0.95+8, POTTER.total(0,1,0));
	}
	@Test
	public void test三本不同书和一本书() {
		
		assertBookTotal(8.0*3*0.9+8, POTTER.total(0,1,2,0));
	}
	@Test
	public void test四本不同书和一本书() {
		
		assertBookTotal(8.0*4*0.8+8, POTTER.total(0,1,2,3,0));
	}
	@Test
	public void test五本不同书和一本书() {
		
		assertBookTotal(8.0*5*0.75+8, POTTER.total(0,1,2,3,4,0));
	}
	
	private void assertBookTotal(double expect, double atual) {
		assertEquals(expect,atual,0.001);
	}

}
