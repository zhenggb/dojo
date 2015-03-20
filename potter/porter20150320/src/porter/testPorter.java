package porter;

import static org.junit.Assert.*;
import org.junit.Test;

public class testPorter {

	private porter PORTER = new porter();
	@Test
	public void test一本都不买() {
		assertTotalPrice(0.0, PORTER.total());
	}

	@Test
	public void test只买一本哈利波特第1集() {
		assertTotalPrice( 8.0,PORTER.total(0));
	}
	@Test
	public void test只买一本哈利波特第4集() {
		assertTotalPrice( 8,PORTER.total(3));
	}
	@Test
	public void test买两本哈利波特第3集() {
		assertTotalPrice( (double)(2*8),PORTER.total(2,2));
	}
	@Test
	public void test买三本哈利波特第3集() {
		assertTotalPrice( (double)(3*8),PORTER.total(2,2,2));
	}
	@Test
	public void test买两本哈利波特第3集和第4集() {
		assertTotalPrice( (double)(2*8*(1-0.05)),PORTER.total(2,3));
	}
	@Test
	public void test买3本哈利波特第2集和3和第4集() {
		assertTotalPrice( (double)(3*8*(1-0.1)),PORTER.total(1,2,3));
	}
	@Test
	public void test买4本哈利波特第2集和3和4和第5集() {
		assertTotalPrice( (double)(4*8*(1-0.2)),PORTER.total(1,2,3,4));
	}
	@Test
	public void test买5本不同的哈利波特() {
		assertTotalPrice( (double)(5*8*(1-0.25)),PORTER.total(0,1,2,3,4));
	}
	
	@Test
	public void test买2本不同和1本哈利波特() {
		assertTotalPrice( (double)(2*8*(1-0.05)+8),PORTER.total(0,0,1));
	}
	@Test
	public void test买两套2本不同哈利波特() {
		assertTotalPrice( (double)(2*8*(1-0.05)*2),PORTER.total(0,0,1,1));
	}
	@Test
	public void test买2本第一集和2本第三集和1本第二集和第四本第四集() {
		assertTotalPrice( (double)((8 * 4 * 0.8) + (8 * 2 * 0.95)),PORTER.total(0,0,1,2,2,3));
	}
	@Test
	public void test买一套完整和1本第二集() {
		assertTotalPrice( (double)(8 + (8 * 5 * 0.75)),PORTER.total(0,1,1,2,3,4));
	}
	@Test
	public void test买一套完整和1本第一集和1本第二集和1本第三集() {
		assertTotalPrice( (double)(2 * (8 * 4 * 0.8)),PORTER.total(0,0,1,1,2,2,3,4));
	}
	@Test
	public void test买4套完整和1本第一集和1本第二集和1本第四集() {
		assertTotalPrice((double)(3 * (8 * 5 * 0.75) + 2 * (8 * 4 * 0.8)),PORTER.total(
				0,0,0,0,0,
				1,1,1,1,1,
				2,2,2,2,
				3,3,3,3,3,
				4,4,4,4));
	}
	private void assertTotalPrice(double expect, double actual) {
		System.out.println(expect+" "+actual);
		assertEquals( expect,actual,0.001);
	}
}
