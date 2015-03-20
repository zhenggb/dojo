package potter;

import static org.junit.Assert.*;

import org.junit.Test;

public class testPotter {

	private  potter POTTER = new potter();
	@Test
	public void 空购书清单() {
		assertBookTotalPrice(0.0, POTTER.total());
	}
	@Test
	public void 只买一本第一集() {
		assertBookTotalPrice(8.0,POTTER.total(0));
	}
	@Test
	public void 只买一本第二集() {
		assertBookTotalPrice(8.0,POTTER.total(1));
	}
	@Test
	public void 只买两本相同的书() {
		assertBookTotalPrice(8*2,POTTER.total(0,0));
	}
	@Test
	public void 买三本相同的书() {
		assertBookTotalPrice(8*3,POTTER.total(0,0,0));
	}
	@Test
	public void 买两本不同的书() {
		assertBookTotalPrice( (double) (8*2*(1-0.05)),POTTER.total(0,1));
	}
	@Test
	public void 买三本不同的书() {
		assertBookTotalPrice( (double) (8*3*(1-0.1)),POTTER.total(0,1,4));
	}
	@Test
	public void 买四本不同的书() {
		assertBookTotalPrice( (double) (8*4*(1-0.2)),POTTER.total(0,1,2,4));
	}
	@Test
	public void 买五本不同的书() {
		assertBookTotalPrice( (double) (8*5*(1-0.25)),POTTER.total(0,1,2,3,4));
	}
	@Test
	public void 买五两本第一集和一本第二集的书() {
		assertBookTotalPrice( (double) (8+8*2*(1-0.05)),POTTER.total(0,0,1));
	}
	@Test
	public void 买五两本第一集和两本第二集的书() {
		assertBookTotalPrice( (double) (2 * (8 * 2 * 0.95)),POTTER.total(0,0,1,1));
	}
	@Test
	public void 买五两本第一集和两本第三集和一本第二集和一本第四集的书() {
		assertBookTotalPrice( (double) (8 * 4 * 0.8+8 * 2 * 0.95),POTTER.total(0, 0, 1, 2, 2, 3));
	}
	@Test
	public void 买一套丛书和一本第一集和一本第二集和一本第三集的书() {
		assertBookTotalPrice( (double) (2 * 8 * 4 * 0.8),POTTER.total(0, 0,1, 1, 2, 2, 3,4));
	}
	private void assertBookTotalPrice(double expect, double atual) {
		assertEquals(expect,atual,0.001);
	}
}
