package potter;

import static org.junit.Assert.*;

import org.junit.Test;

public class testPotter {

	private  potter POTTER = new potter();
	@Test
	public void �չ����嵥() {
		assertBookTotalPrice(0.0, POTTER.total());
	}
	@Test
	public void ֻ��һ����һ��() {
		assertBookTotalPrice(8.0,POTTER.total(0));
	}
	@Test
	public void ֻ��һ���ڶ���() {
		assertBookTotalPrice(8.0,POTTER.total(1));
	}
	@Test
	public void ֻ��������ͬ����() {
		assertBookTotalPrice(8*2,POTTER.total(0,0));
	}
	@Test
	public void ��������ͬ����() {
		assertBookTotalPrice(8*3,POTTER.total(0,0,0));
	}
	@Test
	public void ��������ͬ����() {
		assertBookTotalPrice( (double) (8*2*(1-0.05)),POTTER.total(0,1));
	}
	@Test
	public void ��������ͬ����() {
		assertBookTotalPrice( (double) (8*3*(1-0.1)),POTTER.total(0,1,4));
	}
	@Test
	public void ���ı���ͬ����() {
		assertBookTotalPrice( (double) (8*4*(1-0.2)),POTTER.total(0,1,2,4));
	}
	@Test
	public void ���屾��ͬ����() {
		assertBookTotalPrice( (double) (8*5*(1-0.25)),POTTER.total(0,1,2,3,4));
	}
	@Test
	public void ����������һ����һ���ڶ�������() {
		assertBookTotalPrice( (double) (8+8*2*(1-0.05)),POTTER.total(0,0,1));
	}
	@Test
	public void ����������һ���������ڶ�������() {
		assertBookTotalPrice( (double) (2 * (8 * 2 * 0.95)),POTTER.total(0,0,1,1));
	}
	@Test
	public void ����������һ����������������һ���ڶ�����һ�����ļ�����() {
		assertBookTotalPrice( (double) (8 * 4 * 0.8+8 * 2 * 0.95),POTTER.total(0, 0, 1, 2, 2, 3));
	}
	@Test
	public void ��һ�״����һ����һ����һ���ڶ�����һ������������() {
		assertBookTotalPrice( (double) (2 * 8 * 4 * 0.8),POTTER.total(0, 0,1, 1, 2, 2, 3,4));
	}
	private void assertBookTotalPrice(double expect, double atual) {
		assertEquals(expect,atual,0.001);
	}
}
